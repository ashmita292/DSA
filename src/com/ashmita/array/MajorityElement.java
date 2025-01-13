package com.ashmita.array;

/**
 * 
 * @author User
 * An element is called a majority element if it appears more than n/2 times in the array
 * This algorithm is called Moore's voting algorithm.
 * This algorithm might not give the first occurrence of the element
 * 
 * Hint: Run a loop to find the majority element 
 * and another loop to get the index of the majority element
 * 
 * TC: O(N+N) = O(N)
 *
 */

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 4, 6, 4, 4, 4};
		int ans = majorityElement(arr);
		System.out.println("The majority element index  is "+ ans);
	}

	private static int majorityElement(int[] arr) {
		int res=0, count =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[res]==arr[i]) {
				count++;
			}else 
				count--;
			if(count==0) {
				res = i;
				count = 1;
			}
		}
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[res]) {
				count++;
			}
		}
		if(count<=arr.length/2) return -1;
		return res;
	}

}
