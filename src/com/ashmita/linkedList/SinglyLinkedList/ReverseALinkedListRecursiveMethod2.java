package com.ashmita.linkedList.SinglyLinkedList;

public class ReverseALinkedListRecursiveMethod2 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node prev = null;
		Node ans = recursiveReverse(head, prev);
		printList(ans);
		
	}

	private static Node recursiveReverse(Node curr, Node prev) {
		if(curr == null) return prev;
		Node next = curr.next;
		curr.next = prev;
		return recursiveReverse(next, curr);
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}
	}


}
