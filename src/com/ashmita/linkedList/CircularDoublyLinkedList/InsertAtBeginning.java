package com.ashmita.linkedList.CircularDoublyLinkedList;

public class InsertAtBeginning {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		head.prev = temp2;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = head;
		int data = 5;
		Node ans = insertAtBeginning(head, data);
		printList(ans);
	}

	private static Node insertAtBeginning(Node head, int data) {
		Node temp = new Node(data);
		if(head == null) {
			temp.next = temp;
			temp.prev = temp;
			return temp;
		}
		temp.next = head;
		temp.prev = head.prev;
		head.prev.next = temp;
		head.prev =temp;
		return temp;
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}while(curr!= head);
	}

}
