package com.ashmita.hashing;
/*
 * TC: O(N) where n is the length of the array
 * AS: O(N)
 */

import java.util.HashMap;

public class CheckIfTwoArraysAreEqual {

	public static void main(String[] args) {
		int[] a = { 3, 5, 2, 5, 2 };
		int[] b = { 2, 3, 5, 5, 2 };
		if (checkEqual(a, b)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

	private static boolean checkEqual(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			hmap.put(a[i], hmap.getOrDefault(a[i], 0) + 1);
		}
		for (int i = 0; i < b.length; i++) {
			if (!hmap.containsKey(b[i]))
				return false;
			if (hmap.get(b[i]) == 0)
				return false;
			hmap.put(b[i], hmap.get(b[i]) - 1);
		}

		return true;
	}

}
