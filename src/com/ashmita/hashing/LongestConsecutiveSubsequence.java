package com.ashmita.hashing;

/**
 * TC: O(N)
 * AS: O(N)
 */

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, 4, 7 };
		int res = getLongestConsecutiveSubsequence(arr);
		System.out.println("The longest consecutive subsequence is of length  " + res);
	}

	private static int getLongestConsecutiveSubsequence(int[] arr) {
		HashSet<Integer> hset = new HashSet<>();
		int res = 1;
		for (int a : arr) {
			hset.add(a);
		}
		for (Integer x : hset) {
			if (hset.contains(x - 1) == false) {
				int curr = 1;
				while (hset.contains(x + curr))
					curr++;
				res = Math.max(res, curr);
			}
		}
		return res;
	}

}
