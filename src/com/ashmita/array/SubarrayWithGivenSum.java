package com.ashmita.array;

/**
 * 
 * @author User
 * Maintain two variables for the window size. Say s for the starting point 
 * and e for the endpoint. We use the sliding window of variable size
 * Hint:
 * While curr is less than the sum , extend the window by increasing e
 * While curr is greater than the sum, shrink the window by increasing s
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {10, 40, 20, 5, 4, 1};
		int sum=30;
		boolean ans = isSubsum(arr,sum);
		System.out.println(ans);
	}

	private static boolean isSubsum(int[] arr, int sum) {
		int s=0, curr=0;
		for(int e=0;e<arr.length;e++) {
			curr+=arr[e];
			while(sum<curr) {
				curr-=arr[s];
				s++;
			}
			if(sum==curr)return true;
		}
		return false;
	}

}
