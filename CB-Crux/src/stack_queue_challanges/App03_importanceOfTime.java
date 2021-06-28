package stack_queue_challanges;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/*
5
5 4 2 3 1
5 2 1 4 3
7

4
2 3 1 4
2 1 4 3
3
*/
public class App03_importanceOfTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time = 0;
		Deque<Integer> callingorder = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			callingorder.addLast(sc.nextInt());
		}

		Deque<Integer> idealorder = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			idealorder.addLast(sc.nextInt());
		}

		while (!callingorder.isEmpty() && !idealorder.isEmpty()) {
			if (callingorder.peekFirst() == idealorder.peekFirst()) {
				callingorder.removeFirst();
				idealorder.removeFirst();
				time += 1;
			} else {
				int data = callingorder.removeFirst();
				callingorder.addLast(data);
				time += 1;
			}
		}
		
		System.out.println(time);

	}
}
