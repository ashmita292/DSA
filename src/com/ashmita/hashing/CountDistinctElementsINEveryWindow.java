package com.ashmita.hashing;
/**
 * TC: O(N)
 * AS: O(N)
 */

import java.util.HashMap;

public class CountDistinctElementsINEveryWindow {

	public static void main(String[] args) {
		int[] arr = {10, 20, 10, 10, 30, 40};
		int k =4;
		countDistinctElement(arr, k);
	}

	private static void countDistinctElement(int[] arr, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int order = 1;
		for(int i=0; i<k; i++) {
			hmap.put(arr[i], hmap.getOrDefault(arr[i], 0));
		}
		System.out.println("Order " + order + "-" +  hmap.size());
		for(int i=k; i<arr.length; i++) {
			hmap.put(arr[i-k] , hmap.get(arr[i-k])-1);
			if(hmap.get(arr[i-k]) == 0) {
				hmap.remove(arr[i-k]);
			}
			hmap.put(arr[k], hmap.getOrDefault(arr[k], 0)+1);
			order++;
			System.out.println("Order " + order + "-" + hmap.size());
		}
		
	}

}
