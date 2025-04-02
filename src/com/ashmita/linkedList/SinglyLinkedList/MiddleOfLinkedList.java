package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * for even number of nodes => next node get printed
 *
 */

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		middleOfLinkedList(head);
	}

	private static void middleOfLinkedList(Node head) {
		if(head == null) return;
		Node slow = head, fast= head;
		while(fast != null && fast.next != null) {
			slow =slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
		
	}

}
