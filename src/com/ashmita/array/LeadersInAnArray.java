package com.ashmita.array;

/**
 * 
 * @author User
 * An element is called the leader of an array if it does not have any greater
 * element to the right of it. Even if it has a same value, we don't consider
 * it as a leader.
 * 
 * Hint: Start from the last element(n-1) because the last element is always
 * a leader.
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */
public class LeadersInAnArray {

	public static void main(String[] args) {
		int[] arr = {100, 60, 2, 40, 5, 30};
		leadersOfArray(arr);
	}

	private static void leadersOfArray(int[] arr) {
		int n = arr.length;
		int currentLeader = arr[n-1];
		System.out.println(currentLeader);
		for(int i=n-2; i>=0; i--) {
			if(arr[i] > currentLeader) {
				currentLeader = arr[i];
				System.out.println(currentLeader);
			}
		}
		
	}

}
