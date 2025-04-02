package com.ashmita.linkedList.SinglyLinkedList;

/**
 * 
 * @author User
 * TC: O(1)
 *
 */
public class DeleteFirstNodeInASinglyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head = delHead(head);
		printList(head);

	}
	
	private static Node delHead(Node head) {
		if(head == null)
			return null;
		else
			return head.next;
	}

	private static void printList(Node head) {
		Node curr = head;
		if(head == null) return;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}
