package com.ashmita.hashing;

/**
 * 
 * TC: O(N+M)
 * AS: O(N+M)
 * 
 */

import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {

	public static void main(String[] args) {
		int[] a = { 10, 20, 50, 30 };
		int[] b = { 60, 20 };
		int ans = union(a, b);
		System.out.println("The size of the array after union is " + ans);
	}

	private static int union(int[] a, int[] b) {
		HashSet<Integer> s = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			s.add(b[i]);
		}
		return s.size();
	}

}
