package com.ashmita.neetcode;
/**
 * TC: O(N)
 * AS: O(N)
 */

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = {100, 99, 4, 200, 1, 2, 3};
		int ans = longestConsecutive(nums);
		System.out.println(ans);
	}

	private static int longestConsecutive(int[] nums) {
		if(nums.length ==0) return 0;
		int longestSub = 1;
		HashSet<Integer> hset = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			hset.add(nums[i]);
		}
		for(int num: hset) {
			if(hset.contains(num-1))
				continue;
			else {
				int currNum = num;
				int currentSub =1;
				while(hset.contains(currNum+1)) {
					currentSub++;
					currNum++;
				}
				longestSub = Math.max(currentSub, longestSub);
			}
		}
		return longestSub;
	}

}
