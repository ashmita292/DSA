package com.ashmita.tree;
/**
 * 
 * @author User
 * TC: O(N)
 * AS: O(N)
 * post order traversal: left + right + root
 *
 */
public class PostOrderTraversal {

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
		postOrderTraversal(root);

	}

	private static void postOrderTraversal(Node node) {
		if (node == null)
			return;
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + " ");
	}

}
