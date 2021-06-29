package stack_queue_challanges;

import java.util.Scanner;
import java.util.Stack;

/*
Sample Input
------------
3
1 2 3 

4
2 3 4 1
 
Sample Output
--------------
2 3 -1
Explanation
Next greater element for 1 is 2,
for 2 is 3 but not present for 3 therefore -1

*/
public class App08_findTheGreaterElement {

	static void nextGreaterElement(int[] ar) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < ar.length; i++) {
			if (stack.isEmpty()) {
				stack.push(ar[i]);
			} else if (!stack.isEmpty() && ar[i] > stack.peek()) {
				stack.pop();
				System.out.print(ar[i] + " ");
				stack.push(ar[i]);
			} else if (ar[i] <= stack.peek()) {
				stack.pop();
				System.out.print("-1" + " ");
				stack.push(ar[i]);

			}
		}
		while (!stack.isEmpty()) {
			if (ar[0] > stack.peek()) {
				System.out.println(ar[0]);
			} else {
				System.out.println("-1");
			}
			stack.pop();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		nextGreaterElement(ar);
	}
}
