package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * TC: O(M) + O(N) = O(N+M)
 * AS: O(1)
 * 
 */

public class DetectALoopUsingFlyodsAlgorithm {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node temp = head.next.next.next;
		temp.next= head.next;
		Boolean ans = detectALoop(head);
		System.out.println(ans);
	}

	private static Boolean detectALoop(Node head) {
		Node first_p = head, second_p = head;
		while(first_p != null && first_p.next != null) {
			second_p = second_p.next;
			first_p = first_p.next.next;
			if(first_p == second_p) return true;
		}
		return false;
	}

}
