package com.ashmita.hashing;
/**
 * TC: O(N)
 * AS: O(N+M) = O(N)
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 20, -30, 50 };
		int sum = 30;
		List<Integer> ans = isSumPresentInSubArray(arr, sum);
		if (!ans.isEmpty())
			System.out.println("SubArray is from index " + ans.get(0) + " to " + ans.get(1));
		else
			System.out.println("Not present");
	}

	private static List<Integer> isSumPresentInSubArray(int[] arr, int sum) {
		HashMap<Integer, Integer> s = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int preSum = 0;
		for (int i = 0; i < arr.length; i++) {
			preSum += arr[i];
			if (s.containsKey(preSum - sum)) {
				list.add(s.get(preSum - sum) + 1);
				list.add(i);
			}
			s.put(preSum, i);
		}
		return list;
	}

}
