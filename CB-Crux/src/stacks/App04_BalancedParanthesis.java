package stacks;

import java.util.Stack;

/*
{(a+b)+(c+d)}
{{{((()))}}}
[({a+b})]
*/
public class App04_BalancedParanthesis {

	static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				if (str.charAt(i) == '}') {
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						return false;
					}
				} else if (str.charAt(i) == ')') {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						return false;
					}
				} else {
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
				}
			}

		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		String str = "{{{(a+b)}}}";
		System.out.println(isBalanced(str));
	}
}
