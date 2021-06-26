package queues;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App03_SlidingWindowMaximum {
	// 2 3 1 5 7 1 2 5 4 3
	static int[] slidingWindow(int[] a, int k) {
		int n = a.length; // 10
		Deque<Integer> dequeue = new LinkedList<Integer>();
		int[] ans = new int[n - k + 1];
		int i = 0;
		for (; i < k; i++) {
			while (!dequeue.isEmpty() && a[dequeue.peekLast()] <= a[i]) {
				dequeue.removeLast();
			}
			dequeue.addLast(i);
		}

		for (; i < n; i++) {
			ans[i - k] = a[dequeue.peekFirst()];

			// check number present at 0th index is present in current window or not
			while (!dequeue.isEmpty() && dequeue.peekFirst() <= i - k) {
				dequeue.removeFirst();
			}
			while (!dequeue.isEmpty() && a[dequeue.peekLast()] <= a[i]) {
				dequeue.removeLast();
			}
			dequeue.addLast(i);
		}
		ans[i - k] = a[dequeue.peekFirst()];
		return ans;
	}

	public static void main(String[] args) {
		int[] slidingWindow = slidingWindow(new int[] { 2, 3, 1, 5, 7, 1, 2, 5, 4, 3 }, 3);
		System.out.println(Arrays.toString(slidingWindow));
	}
}
