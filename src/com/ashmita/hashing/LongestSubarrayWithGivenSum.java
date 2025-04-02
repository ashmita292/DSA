package com.ashmita.hashing;
/**
 * 
 * TC: O(N)
 * AS: O(N)
 * 
 * Another similar question can come:
 * Longest subarray with equal number of 0's and 1's
 */
import java.util.HashMap;

public class LongestSubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {5, 2, 3};
		int sum = 5;
		int result = getLongestSubArray(arr, sum);
		System.out.println("Longest subarray with the given sum: "+ result);
	}

	private static int getLongestSubArray(int[] arr, int sum) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int res = 0, preSum =0;
		for(int i=0; i<arr.length; i++) {
			preSum += arr[i];
			if(preSum == sum) {
				res = i+1;
			}
			if(!hmap.containsKey(preSum-sum)) {
				hmap.put(preSum, i);
			}
			if(hmap.containsKey(preSum-sum)){
				res = Math.max(res, i- hmap.get(preSum- sum) );
			}
		}
		return res;
	}

}
