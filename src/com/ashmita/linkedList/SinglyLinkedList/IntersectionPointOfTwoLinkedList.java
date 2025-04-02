package com.ashmita.linkedList.SinglyLinkedList;
/**
 * 
 * @author User
 * Efficient Solution: 
 * 1. Count nodes in both the list. Let conts be c1 and c2
 * 2. Traverse the bigger list abs(c1-c2) times
 * 3. Traverse both the list simultaneously until we see a common node
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */
public class IntersectionPointOfTwoLinkedList {

	public static void main(String[] args) {
		Node head1 = new Node(10);
		head1.next = new Node(5);
		head1.next.next = new Node(4);
		head1.next.next.next = new Node(7);

		Node head2 = new Node(6);
		head2.next = head1.next.next;
		int result = intersectionPointOfTwoinkedList(head1, head2);
		System.out.println(result);
	}

	private static int intersectionPointOfTwoinkedList(Node head1, Node head2) {
		int c1 = 0, c2 = 0;
		for (Node curr1 = head1; curr1 != null; curr1 = curr1.next) {
			c1++;
		}
		for (Node curr2 = head2; curr2 != null; curr2 = curr2.next) {
			c2++;
		}
		int d = Math.abs(c1 - c2);
		Node curr1 = head1, curr2 = head2;
		for (int i = 0; i < d; i++) {
			curr1 = curr1.next;
		}

		while (curr1 != null && curr2 != null) {
			if (curr1 == curr2)
				return curr1.data;
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		return -1;
	}

}
