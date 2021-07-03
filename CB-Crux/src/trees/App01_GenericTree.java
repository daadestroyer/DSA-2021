package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class App01_GenericTree {

	private class Node {
		int data;
		ArrayList<Node> childrenList;

		Node(int data) {
			this.data = data;
			this.childrenList = new ArrayList<>();
		}
	}

	private Node rootNode;
	private int size;

	App01_GenericTree() {
		Scanner sc = new Scanner(System.in);
		this.rootNode = takeInput(sc, null, 0);
	}

	// this function is used to take the input from generic tree
	private Node takeInput(Scanner sc, Node parent, int ithChld) {
		if (parent == null) {
			System.out.println("Enter the data for my root node");
		} else {
			System.out.println("Enter the data for " + ithChld + "th child of " + parent.data);
		}

		int nodeData = sc.nextInt();
		Node newnode = new Node(nodeData);
		this.size++;

		System.out.println("Enter the number of children for node " + newnode.data);
		int noOfChildren = sc.nextInt();

		for (int i = 0; i < noOfChildren; i++) {
			Node child = takeInput(sc, newnode, i);
			newnode.childrenList.add(child);
		}
		return newnode;
	}

	private void display(Node node) {
		String str = node.data + "=>";

		for (int i = 0; i < node.childrenList.size(); i++) {
			str = str + node.childrenList.get(i).data+",";
		}
		str = str + "END";
		System.out.println(str);
		
		for (int i = 0; i < node.childrenList.size(); i++) {
			this.display(node.childrenList.get(i));
		}
	}
	
	public void display() {
		this.display(this.rootNode);
	}

	public static void main(String[] args) {
		App01_GenericTree app01_GenericTree = new App01_GenericTree();
		app01_GenericTree.display();
	}
}
