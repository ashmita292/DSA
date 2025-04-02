package com.ashmita.linkedList.CircularLinkedList;

public class InsertAtTheEnd {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		int data = 40;
		Node ans = insertAtEnd(head, data);
		printList(ans);
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		do{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}while(curr != head);
	}

	//Efficient solution
	private static Node insertAtEnd(Node head, int data) {
		Node temp = new Node(data);
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return temp;
			
		}
	}

}
