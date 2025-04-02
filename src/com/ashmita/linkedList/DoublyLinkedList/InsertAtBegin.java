package com.ashmita.linkedList.DoublyLinkedList;

public class InsertAtBegin {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		int num = 5;
		Node ans = insertAtBegin(head, num);
		printList(ans);
	}

	private static Node insertAtBegin(Node head, int num) {
		Node temp = new Node(num);
		temp.next = head;
		if(head != null)
			head.prev = temp;
		return temp;
		
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
