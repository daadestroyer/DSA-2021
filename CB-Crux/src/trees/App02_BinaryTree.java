package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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

	// LRN
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

	// NLR
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

	// LNR
	private void inOrder(Node rootNode) {
		if (rootNode == null) {
			return;
		}

		inOrder(rootNode.leftNode);
		System.out.print(rootNode.data + " ");
		inOrder(rootNode.rightNode);

	}

	public void inOrder() {
		this.inOrder(this.rootNode);
		System.out.print("END");
	}

	private void levelOrder(Node rootNode) {
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(this.rootNode);

		while (!ll.isEmpty()) {
			Node rvNode = ll.removeFirst();
			System.out.print(rvNode.data + " ");

			if (rvNode.leftNode != null) {
				ll.addLast(rvNode.leftNode);
			}
			if (rvNode.rightNode != null) {
				ll.addLast(rvNode.rightNode);
			}
		}

	}

	public void levelOrder() {
		this.levelOrder(this.rootNode);
		System.out.print(" END");
	}

	private ArrayList<Integer> isBSTLevelOrder(Node rootNode, ArrayList<Integer> aList) {
		if (rootNode == null) {
			return null;
		}
		// perform inorder traversal

		isBSTLevelOrder(rootNode.leftNode, aList);
		aList.add(rootNode.data);
		isBSTLevelOrder(rootNode.rightNode, aList);

		return aList;
	}

	public boolean isBSTLevelOrder(ArrayList<Integer> aList) {
		ArrayList<Integer> bst = this.isBSTLevelOrder(this.rootNode, aList);
		System.out.println(bst);
		for (int i = 0; i < aList.size() - 1; i++) {
			if (aList.get(i) > aList.get(i + 1)) {
				return false;
			}
		}
		return true;

	}

	private boolean isBSTMaxMin(Node rootNode, int min, int max) {

		// basecase
		if (rootNode == null) {
			return true;
		}

		if (rootNode.data > max || rootNode.data < min) {
			return false;
		} else if (!this.isBSTMaxMin(rootNode.leftNode, min, rootNode.data)) {
			return false;
		} else if (!this.isBSTMaxMin(rootNode.rightNode, rootNode.data, max)) {
			return false;
		}
		return true; 
	}

	public boolean isBSTMaxMin() {
		return this.isBSTMaxMin(rootNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private int diameter(Node rootNode) {
		
		if(rootNode == null) {
			return 0;
		}
		// when diameter passes through the root
		int case1 = this.height(rootNode.leftNode)+this.height(rootNode.rightNode)+2;
	
		// calculate max distance b/w two node on left side of tree
		int case2 = this.diameter(rootNode.leftNode);
				
		// calculate max distance b/w two node on right side of tree
		int case3 = this.diameter(rootNode.rightNode);
		
		return Math.max(case1, Math.max(case2, case3));	
	}

	public int diameter() {
		return  this.diameter(this.rootNode);
	}
	

	public static void main(String[] args) {
		App02_BinaryTree binaryTree = new App02_BinaryTree();
		System.out.println();
		binaryTree.display();

// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false

		System.out.println();
		System.out.println("height = " + binaryTree.height());

		System.out.println();
		System.out.println("Post Order");
		binaryTree.postOrder();

		System.out.println("\n\nPre Order");
		binaryTree.preOrder();
		System.out.println("\n\nIn Order");
		binaryTree.inOrder();
		System.out.println("\n\nlevel order");
		binaryTree.levelOrder();

		System.out.println("\n\nIs BST using inOrder");
		// 50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 87 false false
		ArrayList<Integer> aList = new ArrayList<Integer>();
		System.out.println(binaryTree.isBSTLevelOrder(aList));
		
		System.out.println("\nis BST using max-min");
		System.out.println(binaryTree.isBSTMaxMin());
		
		System.out.println("\nDiameter of tree");
		System.out.println(binaryTree.diameter());
	}
}
