package com.ashmita.linkedList.CircularLinkedList;

public class InsertAtBeginning {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		int data = 5;
		Node ans = insertAtBegin(head, data);
		printList(ans);
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}while(curr!= head);
	}

//	private static Node insertAtBegin(Node head, int data) {
//		Node temp = new Node(data);
//		if(head == null) return temp;
//		Node curr = head;
//		while(curr.next != head) {
//			curr = curr.next;
//		}
//		curr.next = temp;
//		temp.next = head;
//		return temp;
//	}
	
	
	//Efficient solution (insert the node after the head and swap the data with head)
	private static Node insertAtBegin(Node head, int data) {
		Node temp = new Node(data);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		else{
			temp.next = head.next;
			head.next = temp;
			int t = head.data;
			head.data = temp.data;
			temp.data = t;
			return head;
		}
	}


}
