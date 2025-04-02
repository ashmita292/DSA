package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * x0->x1->x2->x3->x4
 * 1. Fine the middle of the linked list  => x2
 * 2. Find the second half and reverse it => x4->x3
 * 3. now one by one compare first half and reverse second half
 * x0->x1->x2->x4->x3
 * => compare x0 with x4
 * => x1 with x3
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */
public class PalindromeOfLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        boolean result = isPalindrome(head);

        if (result)
            System.out.println("true");
        else
            System.out.println("false");
	}

	private static boolean isPalindrome(Node head) {
		if(head == null || head.next== null)return true;
		Node slow = head, fast = head;
		while(fast.next != null && fast.next.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node head2 = reverseLinkedList(slow.next);
		slow.next = null;
		Boolean ret = isIdentical(head, head2);
		head2 = reverseLinkedList(head2);
		slow.next = head2;
		return ret;
	}

	private static Node reverseLinkedList(Node head) {
		if(head == null || head.next == null) return head;
		Node curr = head;
		Node prev = null;
		while(curr!= null) {
			Node next = curr.next;
			curr.next= prev;
			prev= curr;
			curr= next;
		}
		return prev;
	}

	private static Boolean isIdentical(Node n1, Node n2) {
		while(n1!= null&& n2!= null) {
			if(n1.data != n2.data) return false;
			n1 = n1.next;
			n2 = n2.next;
		}
		return true;
	}

}
