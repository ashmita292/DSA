package com.ashmita.linkedList.SinglyLinkedList;

public class NthNodeFromEndOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		int n=2;
		nthNodeFromEnd(head, n);
	}

	private static void nthNodeFromEnd(Node head, int n) {
		if(head == null) return;
		Node first = head;
		for(int i=0; i<n; i++) {
			if(first ==null) return;
			first = first.next;
		}
		Node second = head;
		while(first!= null) {
			first = first.next;
			second = second.next;
		}
		System.out.println(second.data);
	}

}
