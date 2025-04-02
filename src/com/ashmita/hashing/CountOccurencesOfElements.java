package com.ashmita.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author User Count occurences of array elements which are more than n/k
 *
 */

public class CountOccurencesOfElements {

	public static void main(String[] args) {
		int[] arr = { 30, 10, 20, 20, 10, 20, 30, 30 };
		int k = 4;
		countOccurencesofElements(arr, k);

	}

	private static void countOccurencesofElements(int[] arr, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
		}
		for (Entry<Integer, Integer> map : hmap.entrySet()) {
			if (map.getValue() > arr.length / k) {
				System.out.println(map.getKey());
			}
		}
	}

}
