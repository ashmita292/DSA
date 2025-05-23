package com.ashmita.linkedList.DoublyLinkedList;

public class ReverseADoublyLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		Node ans = reverseADoublyLinkedList(head);
		printList(ans);
	}

	private static Node reverseADoublyLinkedList(Node head) {
		if (head == null || head.next == null)
			return head;
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
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
