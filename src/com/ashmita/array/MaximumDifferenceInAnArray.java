package com.ashmita.array;

/**
 * 
 * @author User
 * Maximum value of arr[j]-arr[i] such that j>i
 * 
 * Hint: Traverse the array for arr[j] and keep a track of the minimum value(arr[i])
 * Return the maximum difference(res)
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */

public class MaximumDifferenceInAnArray {

	public static void main(String[] args) {
		int[] arr = {10, 9, 60, 50, 40, 2};
		int ans = maximumDifference(arr);
		System.out.println("The maximum difference is "+ ans);
	}

	private static int maximumDifference(int[] arr) {
		int res= arr[1]-arr[0];
		int minValue = arr[0];
		for(int j=1;j<arr.length;j++) {
			res = Math.max(res, arr[j]-minValue);
			minValue = Math.min(minValue, arr[j]);
		}
		return res;
	}

}
