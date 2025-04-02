package com.ashmita.hashing;

/**
 * 
 * TC :- O(N+Q) :- Insertion operation in a Hashmap has average O(1) 
 * time complexity and printing hashmap[i] also takes O(1) time on average. 
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class MaxFreqMinFreq {

	public static void main(String[] args) {
		int[] arr = {1,3,5,3,5,2,7,3};
		maxFreqMinFreq(arr);
	}

	private static void maxFreqMinFreq(int[] arr) {
		Map<Integer, Integer> mp = new HashMap<>();
		int maxFreq = Integer.MIN_VALUE, maxEle = arr[0];
		int minFreq = Integer.MAX_VALUE, minEle = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> num: mp.entrySet()) {
			if(num.getValue()> maxFreq) {
				maxFreq = num.getValue();
				maxEle =num.getKey();
			}
			if(num.getValue()< minFreq) {
				minFreq = num.getValue();
				minEle =num.getKey();
			}
		}
		  System.out.println("Max frequency element: " + maxEle + " with frequency: " + maxFreq);
	      System.out.println("Min frequency element: " + minEle + " with frequency: " + minFreq);
	}

}
