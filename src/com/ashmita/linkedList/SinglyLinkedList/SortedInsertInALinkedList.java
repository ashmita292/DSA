package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * TC: O(pos)
 *
 */

public class SortedInsertInALinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		int data = 35;
		Node ans = sortedInsert(head, data);
		printList(ans);
	}

	private static void printList(Node head) {
		if (head == null)
			return;
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	private static Node sortedInsert(Node head, int data) {
		Node temp = new Node(data);
		if (head == null)
			return temp;
		if (data < head.data) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		while (curr.next != null && curr.next.data < data) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;

	}

}
