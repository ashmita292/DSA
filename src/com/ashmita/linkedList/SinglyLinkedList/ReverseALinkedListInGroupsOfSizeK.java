package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * AS: o(N/K)
 *
 */
public class ReverseALinkedListInGroupsOfSizeK {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		int k = 2;
		Node ans = reverseK(head, k);
		printList(ans);
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

	//Recursive solution
	private static Node reverseK(Node head, int k) {
		Node curr = head, next = null, prev = null;
		int count = 0;
		while (curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if (next != null) {
			Node rest_head = reverseK(next, k);
			head.next = rest_head;
		}
		return prev;
	}

}
