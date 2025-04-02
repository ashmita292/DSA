package com.ashmita.linkedList.CircularLinkedList;

public class TraverseCircularLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		printList(head);
		
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}while(curr != head);
	}

}
