package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * HAve a slow pointer and a fast pointer. the point where they 
 * meet will help you to detect a loop.
 * After detecting the loop, move the slow pointer
 * to the head and now increment each pointer by 1. This
 * time where both the pointers meet is the first point of the loop.
 * Explaination:
 * Before the first meeting point
 * (Distance travelled by slow) *2 = (Distance travelled by fast)
 * => (m+k + x*n)*2 = (m+k + y*n)   [x: no. of iterations made by slow pointer before the first meeting point]
 * => (m+k) = n(y-2x)				[y: no. of iterations made by fast pointer before the first meeting point]
 * So, (m+k) is a multiple of n
 *
 */
public class DetectAndRemoveLoop {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node temp = head.next.next.next;
		temp.next= head.next;
		detectAndRemoveLoop(head);
		printList(head);
	}

	private static void printList(Node head) {
		if(head == null)return;
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+ " ");
			curr= curr.next;
		}
	}

	private static void detectAndRemoveLoop(Node head) {
		Node slow_p = head, fast_p = head;
		while(fast_p!= null && fast_p.next!= null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p)break;
		}
		if(slow_p != fast_p) return;
		slow_p = head;
		while(slow_p.next != fast_p.next) {
			slow_p = slow_p.next;
			fast_p = fast_p.next;
		}
		fast_p.next = null;
	}
}
