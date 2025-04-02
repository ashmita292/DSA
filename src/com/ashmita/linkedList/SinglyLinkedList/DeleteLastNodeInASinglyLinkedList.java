package com.ashmita.linkedList.SinglyLinkedList;

public class DeleteLastNodeInASinglyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head = delTail(head);
		printList(head);
	}

	private static Node delTail(Node head) {
		if(head == null) return null;
		if(head.next == null) return null;
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
		
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
