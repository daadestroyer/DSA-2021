package stacks;

import java.util.Scanner;

public class App01_StackUsingArrays {

	private int[] stack;
	private int top;
	public static final int DEFAULT_CAPACITY = 10;

	public App01_StackUsingArrays() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public App01_StackUsingArrays(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid Capacity");
		}
		this.stack = new int[capacity];
		this.top = -1;

	}

	public int size() {
		if (this.top == -1) {
			return 0;
		}
		return this.top + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int val) throws Exception {
		if (this.size() == this.stack.length) {
			throw new Exception("Stack is full");
		}
		this.top++;
		this.stack[this.top] = val;
	}

	public int pop() {
		if (this.size() == 0) {
			return 0;
		} else {
			int val = this.stack[this.top];
			this.stack[this.top] = 0;
			this.top--;
			return val;
		}
	}

	public int peek() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is empty");
		}
		return this.stack[this.top];
	}

	public void display() {
		if (this.size() == 0) {
			System.out.println("Stack is empty");
		} else {
			for (int i = this.top; i >= 0; i--) {
				System.out.print(this.stack[i] + ",");
			}
			System.out.println("END");
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size");
		int size = sc.nextInt();

		App01_StackUsingArrays stack = new App01_StackUsingArrays(size);

		while (true) {
			System.out.println();
			System.out.println("1. PUSH choice");
			System.out.println("2. POP choice");
			System.out.println("3. SIZE choice");
			System.out.println("4. IS EMPTY choice");
			System.out.println("5. PEEK choice");
			System.out.println("6. DISPLAY choice");
			int choice = sc.nextInt();
			if (choice == 1) {

				while (size-- > 0) {
					System.out.println("Enter element");
					int ele = sc.nextInt();
					stack.push(ele);
				}

			} else if (choice == 2) {
				int pop = stack.pop();
				if (pop == 0) {
					System.out.println("Stack is empty");
				} else {
					System.out.println(pop);
				}
			} else if (choice == 3) {
				int sz = stack.size();
				if (sz == 0)
					System.out.println("Stack is empty");
				else
					System.out.println(sz);
			} else if (choice == 4) {
				boolean empty = stack.isEmpty();
				if (empty)
					System.out.println("Stack is empty");
				else
					System.out.println("Stack is not empty");
			} else if (choice == 5) {
				System.out.println(stack.peek());
			} else if (choice == 6) {
				stack.display();
			} else {
				System.out.println("Wrong Choice");
			}
		}
	}
}
