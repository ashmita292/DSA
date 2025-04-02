package com.ashmita.hashing;
/**
 * TC: O(N)
 * AS: O(N)
 */

import java.util.HashMap;

public class LongestSubarrayWithEqualNoOf0sAnd1s {

	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};
		int res = getSubArray(arr);
		System.out.println("The length of the longest subarray is " + res);
	}

	private static int getSubArray(int[] arr) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int preSum =0, res = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0)
				arr[i] = -1;
		}
		for(int i=0; i<arr.length; i++) {
			preSum += arr[i];
			if(preSum == 0) res = i+1;
			if(!hmap.containsKey(preSum-0))
				hmap.put(preSum, i);
			if(hmap.containsKey(preSum - 0))
				res = Math.max(res, i-hmap.get(preSum-0));
		}
		return res;
	}

}
