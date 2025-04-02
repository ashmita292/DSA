package com.ashmita.linkedList.SinglyLinkedList;

public class RemoveDuplicatesFromSortedSinglyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(30);
		head.next.next.next.next.next = new Node(30);
		removeDuplicates(head);
		printList(head);
	}

	private static void printList(Node head) {
		if (head == null)
			return;
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	private static void removeDuplicates(Node head) {
		if (head == null || head.next == null)
			return;
		Node curr = head;
		while (curr != null && curr.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
	}

}
