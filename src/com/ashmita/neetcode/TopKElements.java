package com.ashmita.neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * @author User
 * TC: O(NlogK)
 * AS: O(N)
 *
 */

public class TopKElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 6, 4, 7, 7, 4, 8 , 3, 3, 7};
		int k =3;
		int[] ans = topKElements(arr, k);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] topKElements(int[] arr, int k) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			count.put(arr[i], count.getOrDefault(arr[i], 0)+1);
		}
		Queue<Integer> heap = new PriorityQueue<>(
				(a,b) -> count.get(a) - count.get(b) );
		for(int n : count.keySet()) {
			heap.add(n);
			if(heap.size()>k) {
				heap.poll();
			}
		}
		int[] ans = new int[k];
		for(int i=0; i<k; i++) {
			ans[i] = heap.poll();
		}
		
		return ans;
	}

}
