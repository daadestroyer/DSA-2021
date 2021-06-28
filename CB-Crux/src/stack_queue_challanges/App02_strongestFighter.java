package stack_queue_challanges;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
Sample Input
------------
5
1 3 1 4 5
3

Sample Output
-------------
3 4 5


Explanation
-----------
First sub-group: 1 3 1 --> Max strength is 3
Second sub-group: 3 1 4 --> Max strength is 4
Third sub-group: 1 4 5 --> Max strength is 5

*/
public class App02_strongestFighter {

	static void strongestFighter(int[] member, int size) {
		Deque<Integer> dq = new LinkedList<Integer>();
		int i = 0;

		for (; i < size; i++) {
			while (!dq.isEmpty() && member[dq.peek()] <= member[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}

		for (; i < member.length; i++) {
			System.out.print(member[dq.peekFirst()]+" ");

			while (!dq.isEmpty() && dq.peek() <= i - size) {
				dq.removeFirst();
			}
			while (!dq.isEmpty() && member[dq.peekLast()] <= member[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		System.out.println(member[dq.peekFirst()]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] member = new int[s];
		for (int i = 0; i < member.length; i++) {
			member[i] = sc.nextInt();
		}
		int size = sc.nextInt();

		strongestFighter(member, size);
	}
}
