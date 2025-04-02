package com.ashmita.linkedList.SinglyLinkedList;

public class SearchInALinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		int x = 20;
		int pos = search(head, x);
		System.out.println("Position is " + pos);
	}

	//Recursive method
	private static int search(Node head, int x) {
		if (head == null)
			return -1;
		if (head.data == x)
			return 1;
		else {
			int res = search(head.next, x);
			if (res == -1)
				return -1;
			else
				return (res + 1);
		}
	}
	
	// Iterative method
//	private static int search(Node head, int x) {
//		Node curr = head;
//		int pos = 1;
//		while (curr != null) {
//			if (curr.data == x)
//				return pos;
//			else {
//				pos++;
//				curr = curr.next;
//			}
//		}
//		return -1;
//
//	}

}
