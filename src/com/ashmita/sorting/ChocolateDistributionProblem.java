package com.ashmita.sorting;
/**
 * 
 * TC: O(NlogN)
 * 
 */
import java.util.Arrays;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		int[] arr= {8, 9, 3, 6, 5, 10, 4};
		int k=3;
		int ans = getMinimumDifference(arr, k);
		System.out.println("The minimum difference in chocolate distribution is " + ans);
	}

	private static int getMinimumDifference(int[] arr, int k) {
		if(k>arr.length) {
			return -1;
		}
		Arrays.sort(arr);
		int res = arr[k-1] -arr[0];
		for(int i=1; (i+k-1)<arr.length; i++) {
			res = Math.min(res, arr[i+k-1]-arr[i]);
		}
		return res;
	}

}
