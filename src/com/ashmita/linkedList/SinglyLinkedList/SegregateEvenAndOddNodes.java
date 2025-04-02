package com.ashmita.linkedList.SinglyLinkedList;

/**
 * Naive Solution: 
 * Traverse the entire linked list and get hold of the last
 * node. Then traverse the list again, if it is a odd node place 
 * it after the last node
 * 
 * Effiecient Solution: 
 * We mantain four variables 
 * 1. os - reference pointer to start at the odd subset 
 * 2. oe - reference pointer to end at the odd subset 
 * 3. es - reference pointer to start at the even subset 
 * 4. ee - reference pointer to end at the even subset 
 * (a) while traversing if the current node is even,
 * 	   we insert it after ee and update ee. Also update es 
 *     if this is the first node
 * (b) Similar to (a) for odd nodes After the loop connect the two lists
 *
 * TC: O(N)
 * AS: O(N)
 */
public class SegregateEvenAndOddNodes {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(4);
		head.next.next.next = new Node(7);
		Node ans = segregateEvenaAndOddNode(head);
		printList(ans);
	}

	private static Node segregateEvenaAndOddNode(Node head) {
		Node es = null, ee = null, os = null, oe = null;
		for (Node curr = head; curr != null; curr = curr.next) {
			if (curr.data % 2 == 0) {
				if (es == null) {
					es = ee = curr;
				} else {
					ee.next = curr;
					ee = ee.next;
				}
			} else {
				if (os == null) {
					os = oe = curr;
				} else {
					oe.next = curr;
					oe = oe.next;
				}
			}
		}
		if(es==null || os==null) return head;
		ee.next = os;
		oe.next = null;
		return es;
	}
	

	private static void printList(Node head) {
		if(head == null)return;
		Node curr = head;
		while(curr!= null) {
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}
	}

}
