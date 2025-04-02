package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * Sol:
 * 1. Swap the first two nodes explicitly
 * 2. Then run a while loop and swap rest of the nodes
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */
public class PairwiseSwapNodesOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(4);
		head.next.next.next = new Node(7);
		Node ans = pairwiseSwap(head);
		printList(ans);
	}

	private static void printList(Node head) {
		if(head == null) return;
		Node curr = head;
		while(curr!= null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	private static Node pairwiseSwap(Node head) {
		if(head == null || head.next == null) return head;
		Node curr = head.next.next;
		Node prev = head;
		head = head.next;
		head.next = prev;
		while(curr != null && curr.next!= null) {
			prev.next = curr.next;
			prev = curr;
			Node next = curr.next.next;
			curr.next.next = prev;
			curr = next;
			
		}
		prev.next = curr;
		return head;
	}

}
