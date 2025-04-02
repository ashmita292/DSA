package com.ashmita.linkedList.CircularLinkedList;

public class DeleteKthNodeInACircularLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = head;
		int k = 2;
		Node ans = deleteKthNode(head, k);
		printList(ans);
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}while(curr != head);
	}

	private static Node deleteKthNode(Node head, int k) {
		if(head == null)return head;
		if(k==1) return deleteHead(head);
		Node curr = head;
		for(int i= 0; i<k-2;i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}

	private static Node deleteHead(Node head) {
		if(head == null)return null;
		if(head.next == null) return null;
		else{
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		}
	}

}
