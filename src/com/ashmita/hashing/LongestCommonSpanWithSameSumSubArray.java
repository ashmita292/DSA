package com.ashmita.hashing;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumSubArray {

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 0, 0, 0, 1};
		int[] arr2 = {1, 0, 1, 0, 0, 1};
		int res = getLongestSpanSubArrayWithSameSum(arr1, arr2);
		System.out.println("The longest span with same sum in binary arrays is of length: " + res);
	}

	private static int getLongestSpanSubArrayWithSameSum(int[] arr1, int[] arr2) {
		int res =0 , preSum =0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int[] temp = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			temp[i] = arr1[i] - arr2[i];
		}
		for(int i=0; i<temp.length; i++) {
			preSum += temp[i];
			if(preSum ==0) res = i+1;
			if(!hmap.containsKey(preSum - 0))
				hmap.put(preSum -0, i);
			if(hmap.containsKey(preSum -0))
				res = Math.max(res, i-hmap.get(preSum-0));
		}
		return res;
	}

	
}
