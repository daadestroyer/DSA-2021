package trees;

import java.util.Scanner;

public class App02_BinaryTree {

	private class Node {
		int data;
		Node leftNode;
		Node rightNode;

		public Node(int data, Node leftNode, Node rightNode) {
			this.data = data;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}

	}

	private Node rootNode = null;
	private int size;

	App02_BinaryTree() {
		Scanner sc = new Scanner(System.in);
		this.rootNode = takeInput(sc, null, false);

	}

	// if node is left for then set true for right set false
	private Node takeInput(Scanner sc, Node parentNode, boolean isLeftOrRight) {
		if (parentNode == null) {
			System.out.println("Enter data for root node");
		} else {
			if (isLeftOrRight) {
				// if true take data for left child
				System.out.println("Enter the left child for " + parentNode.data);
			} else {
				// if false take data for right child
				System.out.println("Enter the right child for " + parentNode.data);
			}
		}

		int data = sc.nextInt();
		// initially for root node there is no child for root node so we set it as null
		// and null
		Node newnode = new Node(data, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child of " + newnode.data);
		choice = sc.nextBoolean();

		if (choice) {
			newnode.leftNode = takeInput(sc, newnode, true);
		}

		choice = false;
		System.out.println("Do you have right child of " + newnode.data);
		choice = sc.nextBoolean();

		if (choice) {
			newnode.rightNode = takeInput(sc, newnode, false);
		}

		return newnode;
	}

	private void display(Node node) {
		String string = "";
		if (node.leftNode != null) {
			string = string + node.leftNode.data + "<=";
		} else {
			string = string + "END<=";
		}

		string = string + node.data + "=>";

		if (node.rightNode != null) {
			string = string + node.rightNode.data;
		} else {
			string = string + "END";
		}
		System.out.println(string);

		if (node.leftNode != null) {
			this.display(node.leftNode);
		}
		if (node.rightNode != null) {
			this.display(node.rightNode);
		}
	}

	public void display() {
		this.display(this.rootNode);
	}

	private int height(Node rootNode) {
		if (rootNode == null) {
			return -1;
		}

		// calculate left subtree height
		int lheight = height(rootNode.leftNode);

		// calculate right subtree height
		int rheight = height(rootNode.rightNode);

		int max = Math.max(lheight, rheight);

		return max + 1;

	}

	public int height() {
		return this.height(this.rootNode);
	}

	private void postOrder(Node rootNode) {
		if (rootNode == null) {
			return;
		}
		postOrder(rootNode.leftNode);
		postOrder(rootNode.rightNode);
		System.out.print(rootNode.data + " ");

	}

	public void postOrder() {
		this.postOrder(this.rootNode);
		System.out.print("END");
	}
	
	private void preOrder(Node rootNode) {
		if (rootNode == null) {
			return;
		}
		System.out.print(rootNode.data + " ");
		postOrder(rootNode.leftNode);
		postOrder(rootNode.rightNode);
		

	}

	public void preOrder() {
		this.preOrder(this.rootNode);
		System.out.print("END");
	}

	public static void main(String[] args) {
		App02_BinaryTree binaryTree = new App02_BinaryTree();
		System.out.println();
		binaryTree.display();

// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false

		System.out.println();
		System.out.println("height = " + binaryTree.height());
		binaryTree.postOrder();
		System.out.println();
		binaryTree.preOrder();

	}
}
