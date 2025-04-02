package com.ashmita.linkedList.CircularLinkedList;

public class DeleteHeadOfACircularLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		Node ans = deleteAtHead(head);
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
	
	//Efficient solution
	private static Node deleteAtHead(Node head) {
		if(head == null) return null;
		if(head.next == null) return null;
		head.data = head.next.data;
		head.next =head.next.next;
		return head;
	}


//	private static Node deleteAtHead(Node head) {
//		if (head == null)
//			return null;
//		if (head.next == null)
//			return null;
//		Node curr = head;
//		while (curr.next != head) {
//			curr = curr.next;
//		}
//		curr.next = head.next;
//		return curr.next;
//	}

}
