package stack_queue_challanges;

import java.util.Scanner;
import java.util.Stack;

/*
Sample Input
-----------
3
3
2
1

Sample Output
-------------
1
2
3

*/
public class App06_reverseStackUsingRecursion {

	static void reverseStack(Stack<Integer> st, Stack<Integer> helper) {
		if (st.isEmpty()) {
			return;
		}

		int data = st.pop();
		reverseStack(st, helper);
		helper.push(data);
		
		while(!helper.isEmpty()) {
			st.push(helper.pop());
		}
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int n = sc.nextInt();
		
		while (n-- > 0) {
			st.push(sc.nextInt());
		}
		
		Stack<Integer> helper = new Stack<Integer>();
		reverseStack(st, helper);
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
}
