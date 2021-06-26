package stack_study;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class App01 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		// pushing element into stack
		/*
		stack.push(10);
		stack.push(20);
		stack.push(30);
		*/
		
		// adding element to stack
		/*
		stack.add(10);
		stack.add(20);
		stack.add(30);
		System.out.println(stack);
		*/
		
		// tell which element is on the top of stack
		/*
		stack.add(10);
		stack.add(20);
		stack.add(30);
		System.out.println(stack.peek());
		*/
		
		// remove and return stack element which is on the top of stack
		/*
		stack.add(10);
		stack.add(20);
		stack.add(30);
		System.out.println(stack.pop());
		System.out.println(stack); // 10 20
		 */
		
		// clear the stack
		/*
		stack.clear();
		System.out.println(stack);
		 */
		
		/*
		stack.add(10);
		stack.add(20);
		
		// return size of stack means how many element are there
		System.out.println(stack.size());
		
		// return the storage capacity
		System.out.println(stack.capacity());
		
		
		*/
		
		// check stack is empty or not
		System.out.println(stack.empty());
		
		// check element is present in stack or not
		System.out.println(stack.contains(10));
		
		// return first element from 0 which is bottom of stack it will consider
		stack.add(10);
		stack.add(20);
		stack.add(30);
		System.out.println(stack.firstElement());

		// return first element from 0 which is bottom of stack it will consider
		stack.add(40);
		stack.add(50);
		stack.add(60);
		System.out.println(stack.get(6));
	
		
	}
}
