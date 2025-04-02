package com.ashmita.dp;

/**
 * 
 * @author User Problem :- You are given an array of size “N” ; you have to
 *         start your journey at index “1” and you need to end your journey at
 *         index “N”.
 * 
 *         You can make jumps of size - 1 or 3 or 5
 * 
 *         In the array positive as well as negative numbers can be available.
 * 
 *         Please find the maximum sum of journey
 * 	TC: O(N)
 *  AS: O(N)
 * 
 */

public class MaximumSumJourney {

	public static void main(String[] args) {
		int[] arr = {0, 5, 8, 3, 100, -5, -5, 5, 10};
		int[] dp = new int[arr.length];
		dp[1] = 5;
		dp[2] = dp[1] + arr[2];
		dp[3] = dp[2]+arr[3];
		dp[4] = Math.max(dp[3]+arr[4], dp[1]+arr[4]);
		dp[5] = Math.max(dp[4]+arr[5], dp[2]+arr[5]);
		for(int i=6;i<arr.length;i++) {
			dp[i]= Math.max(dp[i-1]+arr[i], Math.max(dp[i-3]+arr[i], dp[i-5]+arr[i]));
		}
		System.out.println(dp[arr.length-1]);
			
	}

}
