package queue_study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class App01 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("the");
		q.add("shubham");
		q.add("nigam");

		Iterator<String> iterator = q.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		System.out.println(q.remove());

		System.out.println();

		System.out.println(q.peek());

		System.out.println();

		System.out.println(q.poll());

	}

}
