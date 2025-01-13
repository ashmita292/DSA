package com.ashmita.array;

/**
 * 
 * @author User
 * 1. find the normal maximum sum(using Kadane's algorithm)
 * 2. find the circular sum(total sum - minimum sum subarray)
 * 
 * res = max(normalSum, circularSum)
 * TC: O(N)
 *
 */

public class MaximumCircularSubarraySum {

	public static void main(String[] args) {
		int[] arr = {8, -4, 3, -5, 4};
		int ans = overallMaxSum(arr);
		System.out.println("The maximum circular subarray sum  is "+ ans);
	}
	
	private static int normalMaxSum(int[] arr) {
		int res = arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<arr.length; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			res = Math.max(maxEnding, res);
		}
		return res;
	}
	
	private static int overallMaxSum(int[] arr) {
		int maxNormal = normalMaxSum(arr);
		if(maxNormal<0) return maxNormal; //if all elements in array are negative
		int arrSum = 0;
		for(int i=0;i<arr.length;i++) {
			arrSum += arr[i];
			arr[i] = -arr[i];
		}
		int maxCircular = arrSum + normalMaxSum(arr);
		return Math.max(maxNormal, maxCircular);
	}

}
