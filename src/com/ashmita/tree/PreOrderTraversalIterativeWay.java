package com.ashmita.tree;
/**
 * TC: O(N)
 * AS: O(N)
 */
import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversalIterativeWay {

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
		ArrayList<Integer> res = preOrderTraversal(root);
		for(int data: res) {
			System.out.print(data + " ");
		}
	}

	private static ArrayList<Integer> preOrderTraversal(Node root) {
		if(root == null) return new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		while(!st.isEmpty()) {
			Node node = st.pop();
			res.add(node.data);
			if(node.right!=null)
				st.push(node.right);
			if(node.left != null)
				st.push(node.left);
		}
		return res;
	}

}
