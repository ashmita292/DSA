package com.ashmita.dp;

/**
 * 
 * @author User Given an array. Fins the sum of the numbers from index 1 to
 *         index i
 *
 */

public class SumTillithIndex {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int[] dp = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				dp[i] = arr[i];
			} else {
				dp[i] = dp[i - 1] + arr[i];																											
			}
		}
		int[] queries = { 2, 3, 4 };
		for (int i = 0; i < queries.length; i++) {
			System.out.println(dp[queries[i]-1]);
		}
	}

}
