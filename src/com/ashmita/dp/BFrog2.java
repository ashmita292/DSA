package com.ashmita.dp;

/**
 * 
 * @author User Problem Statement There are N stones, numbered 1,2,…,N. For each
 *         i ( 1≤i≤N), the height of Stone i is h i ​ .
 * 
 *         There is a frog who is initially on Stone 1. He will repeat the
 *         following action some number of times to reach Stone N:
 * 
 *         If the frog is currently on Stone i, jump to one of the following:
 *         Stone i+1,i+2,…,i+K. Here, a cost of ∣h i ​ −h j ​ ∣ is incurred,
 *         where j is the stone to land on. Find the minimum possible total cost
 *         incurred before the frog reaches Stone N.
 *  Question link: https://atcoder.jp/contests/dp/tasks/dp_b
 *
 */

public class BFrog2 {

	public static void main(String[] args) {
		long[] arr = {0, 10, 30, 40, 50, 20}; //Start from index 1(easier for calculation)
		int n= 5, k=3;
		long[] dp = new long[n+1];
		dp[1] = 0;
		dp[2] = Math.abs(arr[2]-arr[1]);
		int i = 3;
		while(i<= n) {
			long ans = Long.MAX_VALUE;
			int j=1;
			while(j<=k && i-j>=1) {
				long yy = Math.abs(arr[i-j]-arr[i])+ dp[i-j];
				ans = Math.min(ans, yy);
				j++;
			}
			dp[i] = ans;
			i++;
		}
		System.out.println(dp[n]);
	}

}
