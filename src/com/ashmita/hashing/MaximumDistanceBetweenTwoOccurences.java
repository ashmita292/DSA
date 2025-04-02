package com.ashmita.hashing;

/*
 * 
 * TC: O(N)
 * AS: O(N)
 */

import java.util.HashMap;

public class MaximumDistanceBetweenTwoOccurences {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 2, 2, 2, 1};
		int res = maxDistance(arr);
		System.out.println("Maximum distance between two occurences is " + res);
	}

	private static int maxDistance(int[] arr) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i], i);
			}else {
				res = Math.max(res, i-hmap.get(arr[i]));
			}
		}
		return res;
	}

}
