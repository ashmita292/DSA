package com.ashmita.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Problem:
 * Check if there are any two Equal numbers in an array 
 * at a distance less than or equal to k
 * 
 * Solution: 
 * For every element, we need to check only the 
 * last occurrence or the Last index where this element has 
 * occurred before. We can use a hashmap which will tell us 
 * the Last occurrence where this element has occurred. 
 * 
 * TC: O(N)
 *
 */
public class CheckEqualNumbersInArray {

	public static void main(String[] args) {
		int[] arr = {1,3,5,3,5,2,7};
		int k = 1;
		Boolean ans = containsNearbyDuplicateOptimized(arr, k);
		if(ans) {
            System.out.println("There are two equal numbers within distance " + k);
		}else {
            System.out.println("No two equal numbers found within distance " + k);
		}
	}

	private static Boolean containsNearbyDuplicateOptimized(int[] arr, int k) {
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i]) && i-(mp.get(arr[i]))<=k)
				return true;
			mp.put(arr[i], i);
		}
		return false;
	}

}
