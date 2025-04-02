package com.ashmita.linkedList.SinglyLinkedList;

public class ReverseALinkedListRecursiveMethod1 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node ans = recursiveReverse(head);
		printList(ans);
		
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}
	}

	private static Node recursiveReverse(Node head) {
		if(head == null || head.next == null) return head;
		Node recHead = recursiveReverse(head.next);
		Node recTail = head.next;
		recTail.next = head;
		head.next = null;
		return recHead;
		
		
	}

}
