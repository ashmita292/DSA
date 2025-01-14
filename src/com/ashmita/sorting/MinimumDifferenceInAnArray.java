package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * @author User
 * Hint: 
 * 1. Sort the array
 * 2. Compute the minimum difference between adjacent elements
 * 3. Return the minimum difference
 * 
 * Time complexity: O(nlogn)
 *
 */

public class MinimumDifferenceInAnArray {

	public static void main(String[] args) {
		int[] arr= {8, 9, 3, 6, 5, 10, 4};
		int ans = getMinimumDifference(arr);
		System.out.println("The minimum difference in an array is " + ans);

	}

	private static int getMinimumDifference(int[] arr) {
		Arrays.sort(arr); //O(NlogN)
		int res = Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) { //O(N)
			res = Math.min(res,(arr[i]-arr[i-1]));
		}
		return res;
	}

}
