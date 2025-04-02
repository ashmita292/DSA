package com.ashmita.tree;
/**
 * Not done
 */
import java.util.ArrayList;

public class PostOrderTraversalIterativeWay {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(8);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);
		ArrayList<Integer> res = postOrderTraversal(root);
		for(int data: res) {
			System.out.print(data + " ");
		}
	}

	private static ArrayList<Integer> postOrderTraversal(Node root) {
		return null;
	}

}
