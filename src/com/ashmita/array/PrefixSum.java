package com.ashmita.array;
/**
 * 
 * @author User
 * Hint: Find pSum array
 * ans = pSum[r] - pSum[l-1]
 *
 */

public class PrefixSum {

	public static void main(String[] args) {
		int[] arr = {10, 60, 40, 50, 20, 70};
		int l=0, r=4;
		int ans = prefixSum(arr,l,r);
		System.out.println("The prefix sum is "+ ans);
	}

	private static int prefixSum(int[] arr, int l, int r) {
		int[] pSum = new int[arr.length];
		pSum[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			pSum[i] = pSum[i-1] + arr[i];
		}
		if(l==0) return pSum[r];
		return pSum[r] - pSum[l-1];
	}

}
