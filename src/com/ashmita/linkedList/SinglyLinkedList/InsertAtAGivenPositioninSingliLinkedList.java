package com.ashmita.linkedList.SinglyLinkedList;

public class InsertAtAGivenPositioninSingliLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		int position = 3;
		int data = 25;
		head = insertPos(head, position, data);
		printList(head);
	}

	private static Node insertPos(Node head, int pos, int data) {
		Node temp = new Node(data);
		if(pos == 1) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		for(int i=1; i<= pos-2 && curr!=null; i++) {
			curr = curr.next;
		}
		if(curr == null)
			return head;
		temp.next = curr.next;
		curr.next = temp;
		
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
