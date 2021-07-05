package trees;

import java.util.Scanner;

/*

*/
public class App03_BST {

	private class Node {

		int data;
		Node leftNode;
		Node rightNode;

	}

	private Node rootNode;

	public App03_BST(int[] ar) {
		this.rootNode = construct(ar, 0, ar.length - 1);
	}

	private Node construct(int[] ar, int low, int hi) {

		if (low > hi) {
			return null;
		}
		// find mid
		int mid = (low + hi) / 2;

		// create a new node
		Node node = new Node();
		node.data = ar[mid];

		// left recursive call from low to mid-1;

		node.leftNode = construct(ar, low, mid - 1);
		node.rightNode = construct(ar, mid + 1, hi);

		return node;

	}

	private void display(Node rootNode) {
		if (rootNode == null) {
			return;
		}
		String str = "";

		if (rootNode.leftNode != null) {
			str = str + rootNode.leftNode.data + "<-";
		} else {
			str = str + ".<-";
		}
		str = str + rootNode.data + "->";

		if (rootNode.rightNode != null) {
			str = str + rootNode.rightNode.data;
		} else {
			str = str + "END";
		}

		System.out.println(str);

		display(rootNode.leftNode);
		display(rootNode.rightNode);
	}

	public void display() {
		this.display(this.rootNode);
	}

	private boolean findInBst(int item, Node rootNode) {
		if (rootNode == null) {
			return false;
		}

		if (item == rootNode.data) {
			return true;
		}

		if (item > rootNode.data) {
			return findInBst(item, rootNode.rightNode);

		} else {
			return findInBst(item, rootNode.leftNode);

		}

	}

	public boolean findInBst() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter item to search in BST");
		int item = scanner.nextInt();
		return this.findInBst(item, this.rootNode);
	}

	public static void main(String[] args) {
		App03_BST bst = new App03_BST(new int[] { 10, 20, 30, 40, 50, 60, 70 });
		bst.display();
		System.out.println(bst.findInBst());
	}
}
