package stacks;

import java.util.Stack;

/*
2-->3
1-->2
3-->5
5-->6
6-->7
7-->8
*/
public class App03_NextGreaterElement {
	public static void main(String[] args) {
		int[] ar = { 2, 1, 3, 8, 6, 7, 5 };
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < ar.length; i++) {
			while (!stack.isEmpty() && ar[i] > stack.peek()) {
				int rv = stack.pop();
				System.out.println(rv + "->" + ar[i]);

			}
			stack.push(ar[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + "->" + "-1");
		}
	}
}
