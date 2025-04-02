package com.ashmita.dp;
/**
 * 
 * TC: O(N)
 * AS: O(N)
 */

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 5;
		int result = nthFibonacci(n);
		System.out.println(result);
	}

	//Using memoization technique
//	private static int nthFibonacci(int n) {
//		int[] memo = new int[n+1];
//		Arrays.fill(memo, -1);
//		return nthFibonacciUtil(n, memo);
//	}
//
//	private static int nthFibonacciUtil(int n, int[] memo) {
//		if(n<=1) return n;
//		if(memo[n] != -1)
//			return memo[n];
//		return nthFibonacciUtil(n-1, memo) + nthFibonacciUtil(n-2, memo);
//	}
	
	//Using dp AS: O(N)
//	private static int nthFibonacci(int n) {
//		int[] dp = new int[n+1];
//		dp[0] = 0;
//		dp[1] =1;
//		for(int i=2;i<=n; i++) {
//			dp[i] = dp[i-1]+dp[i-2];
//		}
//		return dp[n];
//	}
	
	//Space optimized Approach AS: O(1)
	private static int nthFibonacci(int n) {
		if(n<=1) return n;
		int curr =0;
		int prev1 = 1;
		int prev2 = 0;
		for(int i=2; i<=n; i++) {
			curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}
		return curr;
	}

}
