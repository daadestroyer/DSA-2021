package queues;

import java.util.LinkedList;
import java.util.Queue;

public class App02_QueueUsingLinkedList {

	LinkedList<Integer> queue;

	public App02_QueueUsingLinkedList() {
		queue = new LinkedList<Integer>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void enqueue(int data) {
		queue.addLast(data);
	}

	public void dequeue() {
		queue.removeFirst();
	}

	public int getFront() {
		return queue.getFirst();
	}

	public static void main(String[] args) {
		App02_QueueUsingLinkedList queueLL = new App02_QueueUsingLinkedList();
		for (int i = 1; i <= 5; i++) {
			queueLL.enqueue(i);
		}
		
		queueLL.dequeue();
		queueLL.dequeue();
		queueLL.enqueue(6);
		
		while(!queueLL.isEmpty()) {
			System.out.println(queueLL.getFront());
			queueLL.dequeue();
		}
	}
}
