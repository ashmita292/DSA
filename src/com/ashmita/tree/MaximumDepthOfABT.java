package com.ashmita.tree;
/**
 * 
 * @author User
 * TC: O(N)
 * AS: O(N)
 *
 */
public class MaximumDepthOfABT {

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
		int depth = maximumDepth(root);
		System.out.println(depth);
	}

	private static int maximumDepth(Node node) {
		if(node == null) return 0;
		int lh = maximumDepth(node.left);
		int rh = maximumDepth(node.right);
		
		
		return  1+ Math.max(lh, rh);
	}

}
