package com.ashmita.linkedList.DoublyLinkedList;

public class InsertAtEnd {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		int num = 35;
		Node ans = insertAtEnd(head, num);
		printList(ans);
	}

	private static Node insertAtEnd(Node head, int num) {
		Node temp = new Node(num);
		if(head == null) return temp;
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		
		return head;
		
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
