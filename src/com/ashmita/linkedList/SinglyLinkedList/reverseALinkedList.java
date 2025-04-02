package com.ashmita.linkedList.SinglyLinkedList;

public class reverseALinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node ans  = reverseALinkedList(head);
		printList(ans);
	}

	private static void printList(Node head) {
		if(head == null)return;
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	private static Node reverseALinkedList(Node head) {
		Node curr = head;
		Node prev =null;
		while(curr!= null) {
			Node next = curr.next;
			curr.next = prev;
			prev= curr;
			curr= next;
		}
		return prev;
	}

}
