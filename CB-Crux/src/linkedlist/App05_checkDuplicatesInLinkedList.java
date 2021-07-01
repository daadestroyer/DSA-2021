package linkedlist;

import java.util.Scanner;

public class App05_checkDuplicatesInLinkedList {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public void addLast(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size == 0) {
			this.tail = this.head = nn;
			this.size++;
		} else {
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void display(Node temp) {

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public int removeFirst() throws Exception {
		if (size == 0) {
			throw new Exception("LinkedList is empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}

	public boolean checkDuplicate(App05_checkDuplicatesInLinkedList node, int data) {
		Node temp = node.head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void detectDuplicate(App05_checkDuplicatesInLinkedList original) throws Exception {
		App05_checkDuplicatesInLinkedList ll = new App05_checkDuplicatesInLinkedList();

		while (original.size != 0) {
			int data = original.removeFirst();

			if (ll.size == 0) {
				ll.addLast(data);
			} else {
				boolean res = checkDuplicate(ll, data);
				if (res == true) {
					break;
				} else {
					ll.addLast(data);
				}
			}
		}
		display(ll.head);
	}

	public static void main(String[] args) throws Exception {
		App05_checkDuplicatesInLinkedList list = new App05_checkDuplicatesInLinkedList();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int data = scanner.nextInt();
			list.addLast(data);
			if (data == -1) {
				break;
			}
		}
		list.detectDuplicate(list);
	}
}
