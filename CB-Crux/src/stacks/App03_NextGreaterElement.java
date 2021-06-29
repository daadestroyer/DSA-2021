package stacks;

import java.util.Scanner;
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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < ar.length; i++) {
			while (!stack.isEmpty() && ar[i] > stack.peek()) {
				int rv = stack.pop();
				System.out.print(ar[i]+" ");

			}
			stack.push(ar[i]);
		}
		while (!stack.isEmpty()) {
			stack.pop();
			System.out.println("-1");
		}
	}
}
