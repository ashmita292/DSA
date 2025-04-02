package com.ashmita.dp;
/**
 * 
 * @author User
 * DP 5 By kumar k sir
 * you can either jump i+1 or i+3 to reach the destination. Find the minimum cost
 *
 */

public class MinimumCostToReachTheDestination {

	public static void main(String[] args) {
		int[] arr = {4, 12, 13, 18, 10, 12};
		int[] dp = new int[arr.length+1];
		dp[0] = 0;
		dp[1] = Math.abs(arr[0] - arr[1]);
		dp[2]= Math.abs(arr[1]-arr[2])+ dp[1];
		for(int i=3; i<arr.length; i++) {
			int k1 = Math.abs(arr[i-1]-arr[i])+ dp[i-1];
			int k2 = Math.abs(arr[i-3]-arr[i]) + dp[i-3];
			dp[i] = Math.min(k1, k2);
		}
		System.out.println("Minimum cost required to reach the destination is " + dp[arr.length-1]);
	}

}
