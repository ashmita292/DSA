package com.ashmita.linkedList.SinglyLinkedList;

public abstract class InsertAtBeginning {

	public static void main(String[] args) {
		Node head = null;
		head = insertAtBegin(head, 30);
		head = insertAtBegin(head, 20);
		head = insertAtBegin(head, 10);
		printList(head);
	}

	private static Node insertAtBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}
	
	private static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}
