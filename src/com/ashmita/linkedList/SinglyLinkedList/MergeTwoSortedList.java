package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * TC: O(N)
 * AS: O(1)
 *
 */
public class MergeTwoSortedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(4);
		head.next.next.next = new Node(6);
		
		Node head1 = new Node(2);
		head1.next = new Node(3);
		head1.next.next = new Node(7);
		head1.next.next.next = new Node(9);
		
		Node ans = mergeTwoSortedList(head, head1);
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

	private static Node mergeTwoSortedList(Node a, Node b) {
		if(a== null) return a;
		if(b==null) return b;
		Node head = null, tail = null;
		if(a.data<=b.data) {
			head = tail = a;
			a= a.next;
		}else {
			head = tail = b;
			b= b.next;
		}
		while(a!= null && b!=null) {
			if(a.data<= b.data) {
				tail.next = a;
				tail = a;
				a= a.next;
			}else {
				tail.next = b;
				tail = b;
				b = b.next;
			}
		}
		if(a!=null)tail.next = a;
		else tail.next =b;
		return head;
	}

}
