package stack_queue_challanges;

import java.util.Scanner;
import java.util.Stack;
/*
5
1 2 3 4 5
*/
public class App10_histogram {

	static int largestArea(int[] bars, Stack<Integer> stack) {

		int stack_top_area = 0;
		int max_area = 0;
		int stack_top_element = 0;
		int i = 0;
		for (; i < bars.length;) {
			if (stack.isEmpty() || bars[stack.peek()] <= bars[i]) {
				stack.push(i);
				i++;
			} else {
				stack_top_element = stack.pop();

				stack_top_area = bars[stack_top_element] * (stack.isEmpty() ? i : i - stack.peek() - 1);
				if (stack_top_area > max_area) {
					max_area = stack_top_area;
				}
			}
		}

		while (!stack.isEmpty()) {
			stack_top_element = stack.pop();

			stack_top_area = bars[stack_top_element] * (stack.isEmpty() ? i : i - stack.peek() - 1);

			if (stack_top_area > max_area) {
				max_area = stack_top_area;
			}
		}
		return max_area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] bars = new int[s];
		for (int i = 0; i < bars.length; i++) {
			bars[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(largestArea(bars, stack));
	}
}
