package stack_queue_challanges;

import java.util.Scanner;
import java.util.Stack;

/*

(())

*/
public class App07_balancedParanthesis {

	static String balancedString(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
				if (stack.isEmpty()) {
					return "No";
				}
				if (str.charAt(i) == '}') {
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						return "No";
					}

				} else if (str.charAt(i) == ')') {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						return "No";
					}

				} else {

					if (stack.peek() == ']') {
						stack.pop();
					} else {
						return "No";
					}

				}
			}
		}
		return "Yes";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(balancedString(s));
	}
}
