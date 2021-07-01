package linkedlist;

import java.util.Scanner;

public class App04_getNthNodeFromBack {

	class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	void addLast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (this.size == 0) {
			this.head = this.tail = node;
			this.size++;
		} else {
			this.tail.next = node;
			this.tail = node;
			this.size++;
		}
	}

	public int getNth(int index) {
		Node sn = this.head;
		Node fn = this.head;

		for (int i = 0; i < index; i++) {
			fn = fn.next;
		}
		while (fn != null) {
			sn = sn.next;
			fn = fn.next;
		}
		return sn.data;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		App04_getNthNodeFromBack ll = new App04_getNthNodeFromBack();
		while (sc.hasNext()) {
			int no = sc.nextInt();
			
			ll.addLast(no);
			if (no == -1) {
				break;
			}
		}
		int index = sc.nextInt();
		int ans = ll.getNth(index);
		System.out.println(ans);

	}
}
