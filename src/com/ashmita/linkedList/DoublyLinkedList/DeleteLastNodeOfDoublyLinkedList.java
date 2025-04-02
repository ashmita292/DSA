package com.ashmita.linkedList.DoublyLinkedList;

public class DeleteLastNodeOfDoublyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		Node ans = deleteLastNode(head);
		printList(ans);
	}

	private static Node deleteLastNode(Node head) {
		if(head == null) return null;
		if(head.next == null) return null;
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.prev.next = null;
		return head;
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
}
