package linkedlist;

public class App01_implementLinkedList {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size = 0;

	// O(1)
	public void display() {
		System.out.println("------------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("------------------------");
	}

	// O(1)
	public void addLast(int item) {

		// create a node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// update summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	// O(1)
	public void addFirst(int data) {
		Node nn = new Node();
		nn.data = data;
		nn.next = null;

		if (this.size >= 1) {
			nn.next = this.head;
		}

		// summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	// O(1)
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		return this.head.data;

	}

	// O(1)
	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}

		return this.tail.data;

	}

	// O(1)
	public int getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}
		if (idx <= 0 || idx > this.size) {
			throw new Exception("invalid size");
		}
		Node temp = this.head;

		for (int i = 1; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	// O(1)
	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0) {
			System.out.println("Linked List is empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid size");
		}
		Node temp = this.head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(1)
	private void addAt(int item, int idx) throws Exception {
		if (idx <= 0 || idx > this.size) {
			throw new Exception("Invalid Size");
		}

		if (this.size == 0) {
			this.addFirst(item);
		} else if (idx == this.size) {
			this.addLast(item);
		} else {
			// create new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			Node nm1 = this.getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;
			this.size++;

		}
	}

	// O(1)
	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
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

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}
		int rv = this.tail.data;

		if (this.size == 1) {
			this.head = this.tail = null;
			this.size = 0;
		} else {
			Node nm2 = this.getNodeAt(this.size - 2);
			nm2.next = null;
			this.tail = nm2;
			this.size--;
		}
		return rv;
	}

	public int removeAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is empty");
		}
		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = this.getNodeAt(idx);
			Node np1 = this.getNodeAt(idx + 1);

			nm1.next = np1;
			this.size--;

			return n.data;
		}

	}

	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size-1;

		while (left < right) {
			Node ln = this.getNodeAt(left);
			Node rn = this.getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) throws Exception {
		App01_implementLinkedList ll = new App01_implementLinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		

//		ll.display();
//
//		System.out.println("getFirst -> " + ll.getFirst());
//		System.out.println("getLast  -> " + ll.getLast());
//		System.out.println("getAt    -> " + ll.getAt(6));
//		Node nodeAt = ll.getNodeAt(6);
//		System.out.println("nodeAt   -> " + nodeAt.data);
//
//		ll.addAt(100, 3);
//		ll.display();
//		System.out.println("removeFirst -> " + ll.removeFirst());
//		ll.display();
//		System.out.println("removeLast -> " + ll.removeLast());
//		ll.display();
//		System.out.println("removeAt -> "+ll.removeAt(1));
		ll.display();
		
		ll.reverseData();
		
		ll.display();
	}
}
