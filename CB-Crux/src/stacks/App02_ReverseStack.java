package stacks;

public class App02_ReverseStack {

	static void reverseStack(App01_StackUsingArrays stack1, App01_StackUsingArrays stack2, int idx) throws Exception {
		if (stack1.isEmpty()) {
			return;
		}
		int data = stack1.pop();
		reverseStack(stack1, stack2, idx + 1);
		stack2.push(data);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}

	}

	public static void main(String[] args) throws Exception {
		App01_StackUsingArrays stack1 = new App01_StackUsingArrays(5);
		for (int i = 1; i <= 5; i++) {

			stack1.push(i * 10);
		}
		System.out.println("Original Stack");
		stack1.display();

		App01_StackUsingArrays stack2 = new App01_StackUsingArrays(5);

		reverseStack(stack1, stack2, 0);
		System.out.println("\nReversed Stack");
		stack1.display();
	}
}
