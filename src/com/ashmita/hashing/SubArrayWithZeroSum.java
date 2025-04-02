package com.ashmita.hashing;
/*
 * 
 * Technique: prefixSum + hashing
 * If the prefix sum is present in the hashset, then there are 
 * subarray with zero sum
 * TC: O(N)
 * AS: O(N)
 * 
 */
import java.util.HashSet;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] arr = {-3, 5, -3, -1, 1};
		Boolean ans = isZeroSubArray(arr);
		System.out.println("Is SubArray with zero sum present: " + ans);
	}

	private static Boolean isZeroSubArray(int[] arr) {
		HashSet<Integer> s = new HashSet<>();
		int preSum= 0;
		for(int a: arr) {
			preSum += a;
			if(s.contains(preSum))return true;
			if(preSum == 0) return true;
			s.add(preSum);
		}
		return false;
	}

}
