package stack_queue_challanges;

import java.util.Scanner;
import java.util.Stack;

/*
(((a+(b))+(c+d)))
((a+(b))+(c+d))
*/

public class App01_redundantParanthesis {

	static boolean redundantParanthesis(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ')') {
				if(stack.peek() == '(') {
					return true;
				}
				else {
					while(stack.peek() != '(') {
						stack.pop();
					}
				}
			}
			else {
				stack.push(str.charAt(i));
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean redundantParanthesis = redundantParanthesis(str);
		if(redundantParanthesis) {
			System.out.println("Duplicate");
		}
		else {
			System.out.println("Not Duplicate");
		}
	}
}
