package com.ashmita.dp;

/**
 * 
 * @author User Find the maximum sum subarray such that no two elements are
 *         consecutive
 *
 */
public class MaximumSumSubset {

	public static void main(String[] args) {
		int[] arr = { 1, -3, 5, 7, 3, 8, -6 };
		int[] dp = new int[arr.length + 1];
		dp[0] = arr[0];
		dp[1] = Math.max(dp[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
				dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
		}
		System.out.println("Maximum possible sum is " + dp[arr.length-1]);
		int ans = solve(arr.length, arr);
		System.out.println("The maximum sum subset using space optimization technique: " + ans);
	}

	
	//Space optimized solution
	static int solve(int n, int[] arr) {
		int prev = arr[0];
		int prev2 = 0;
		for(int i=1; i<n ;i++) {
			int pick = arr[i];
			if(i>1)
				pick += prev2;
			int nonPick = prev;
			int curr = Math.max(pick, nonPick);
			prev2 = prev;
			prev = curr;
		}
		return prev;
		
	}
}
