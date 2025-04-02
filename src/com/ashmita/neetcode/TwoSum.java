package com.ashmita.neetcode;
/**
 * TC: O(N)
 * AS: O(N)
 */
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {15, 7, 2, 11};
		int target = 17;
		int[] ans = twoSum(nums, target);
		for(int a : ans) {
			System.out.print(a + " ");
		}
	}

	private static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer, Integer> hmap = new HashMap<>();
			for(int i=0; i<nums.length; i++) {
				if(hmap.containsKey(target-nums[i])) {
					return new int[] {hmap.get(target - nums[i]), i};
				}
	            hmap.put(nums[i], i);
			}
			return new int[]{};
	}

}
