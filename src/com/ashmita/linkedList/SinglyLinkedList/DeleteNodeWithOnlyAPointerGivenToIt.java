package com.ashmita.linkedList.SinglyLinkedList;

public class DeleteNodeWithOnlyAPointerGivenToIt {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node temp = head.next.next;
		deleteNode(temp);
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

	private static void deleteNode(Node temp) {
		temp.data = temp.next.data;
		temp.next = temp.next.next;
	}

}
