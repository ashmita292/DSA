package com.ashmita.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Problem:
 * Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j] 
 * 
 * TC: O(N)
 * AS: o(N)
 *
 */

public class DifferenecOfTwoNumbers {

	public static void main(String[] args) {
		int[] arr = {11,6,3,5,6};
		int k = 5;
		int ans = countDifference(arr,k);
		System.out.println("Count is " + ans);
	}

	private static int countDifference(int[] arr, int k) {
		Map<Integer, Integer> mp = new HashMap<>();
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			if(mp.containsKey(k+arr[i]))
				count += mp.get(k+arr[i]);
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
		}
		
		return count;
	}

}
