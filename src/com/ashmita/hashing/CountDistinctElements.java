package com.ashmita.hashing;

/*
 * TC: O(N)
 * AS: O(N)
 */

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {

	public static void main(String[] args) {
		Integer[] arr = {10, 20, 10, 20, 30};
		int res = countDistinctElements(arr);
		System.out.println("Number of distinct elements are " + res);
	}

	private static int countDistinctElements(Integer[] arr) {
		HashSet<Integer> hset = new HashSet<>(Arrays.asList(arr));
	
		return hset.size();
	}

}
