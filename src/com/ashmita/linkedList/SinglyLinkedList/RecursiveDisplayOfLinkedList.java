package com.ashmita.linkedList.SinglyLinkedList;

public class RecursiveDisplayOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		rPrint(head);
	}

	private static void rPrint(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		rPrint(head.next);
	}

}
