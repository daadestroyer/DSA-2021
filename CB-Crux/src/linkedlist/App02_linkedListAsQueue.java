package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class App02_linkedListAsQueue {
	private LinkedList<Integer> queue;

	public App02_linkedListAsQueue() {
		this.queue = new LinkedList<Integer>();
	}

	public int size() {
		return this.queue.size();
	}

	public boolean isEmpty() {
		return this.queue.isEmpty();
	}

	public void enqueue(int data) {
		this.queue.addLast(data);
	}

	public int dequeue() {
		return this.queue.removeFirst();
	}

	public int front() {
		return this.queue.getFirst();
	}

	public void display() {
		System.out.println(this.queue);
	}

	public static void main(String[] args) {
		App02_linkedListAsQueue ll = new App02_linkedListAsQueue();
		ll.enqueue(10);
		ll.enqueue(20);
		ll.enqueue(30);
		ll.enqueue(40);
		ll.display();
		
		System.out.println(ll.isEmpty()+" "+ll.size());
		System.out.println(ll.dequeue());
	}
}
