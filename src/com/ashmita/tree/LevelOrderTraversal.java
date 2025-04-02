package com.ashmita.tree;
/**
 * 
 * TC: O(N)
 * AS: O(N)
 * 
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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
		ArrayList<ArrayList<Integer>> res = levelOrderTraversal(root);
		for(ArrayList<Integer> level : res) {
			for(int data: level)
				System.out.print(data + " ");
		}
	}

	private static ArrayList<ArrayList<Integer>> levelOrderTraversal(Node root) {
		if(root== null)return new ArrayList<>();
		
		Queue<Node> q = new LinkedList<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		q.add(root);
		int currentLevel =0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			res.add(new ArrayList<>());
			for(int i=0; i<len ; i++) {
				Node node = q.poll();
				res.get(currentLevel).add(node.data);
				
				if(node.left!=null) {
					q.add(node.left);
				}
				if(node.right!=null) {
					q.add(node.right);
				}
			}
			currentLevel++;
		}
		return res;
	}

}
