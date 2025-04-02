package com.ashmita.hashing;
/**
 * 
 * TC: O(N*M) where n is the size of 'a' array and m is the size of 'b' array
 * AS: O(N)
 * 
 */

import java.util.HashSet;

public class IntersectionOfTwoUnsortedArray {

	public static void main(String[] args) {
		int[] a = {10, 20, 50, 30};
		int[] b = {30, 20};
		intersect(a, b);
	}

	private static void intersect(int[] a, int[] b) {
		HashSet<Integer> s = new HashSet<>();
		for(int i=0;i<b.length; i++) {
			s.add(b[i]);
		}
		for(int i=0;i<a.length;i++) {
			if(s.contains(a[i]))
				System.out.print(a[i] + " ");
		}
	}

}
