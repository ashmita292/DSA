package com.ashmita.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Problem:
 * Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j]
 * 
 * Optimised Approach:- 
 * At each Index i, we will find the Complementary Element 
 * We need. Now, we will check if this 
 * Complementary Element is present in Map Already, we will 
 * do cnt+=frequency of complement. We will now update entry 
 * of our current index element in map.
 * 
 * TC: O(N)
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {1,2,6,3,5};
		int k = 5;
		int ans = countPair(arr,k);
		System.out.println("Count is " + ans);
	}

	private static int countPair(int[] arr, int k) {
		Map<Integer, Integer> mp = new HashMap<>();
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(k-arr[i]))
				count+= mp.get(k-arr[i]);
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
				
		}
		return count;
	}

}
