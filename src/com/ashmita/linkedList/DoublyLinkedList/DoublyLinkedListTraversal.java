package com.ashmita.linkedList.DoublyLinkedList;

public class DoublyLinkedListTraversal {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		printList(head);
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}
