package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * To insert at the end we need to get hold of the last node
 *
 */

public class InsertAtEnd {

	public static void main(String[] args) {
		Node head = null;
		head = insertAtEnd(head, 10);
		head = insertAtEnd(head, 20);
		head = insertAtEnd(head, 30);
		printList(head);
	}

	private static void printList(Node head) {
		Node curr = head;
		if (head == null)
			return;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	private static Node insertAtEnd(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) 
			return temp;
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}

}
