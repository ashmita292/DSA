package com.ashmita.array;

/**
 * 
 * @author User
 * You have two options-
 * 1. maxEnding + the current element 
 * 2. current element
 * because maxEnding contains the maximum sum of the previous sub arrays.
 * TC: O(N)
 * AS: O(1)
 *
 */

public class MaximumSumSubarray {
	
	public static void main(String[] args) {
		int[] arr = {1, 4, -3, 6, -5, 11, 10, -8};
		int ans = maxSum(arr);
		System.out.println("The maximum sum of subarray is "+ ans);
	}

	private static int maxSum(int[] arr) {
		int res = arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<arr.length;i++) {
			maxEnding  = Math.max(maxEnding + arr[i], arr[i]);
			res =Math.max(res, maxEnding);
		}
		return res;
	}

}
