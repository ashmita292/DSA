package com.ashmita.neetcode;

import java.util.Arrays;

/**
 * 
 * @author User Use two pointer approach TC: O(N) AS:O(1)
 *
 */

public class TwoSumII {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target =9;
		int[] ans = twoSum(nums, target);
		System.out.println(Arrays.toString(ans));
		

	}

	private static int[] twoSum(int[] numbers, int target) {
		int left=0;
		int right = numbers.length-1;
		while(left<right) {
			if(numbers[left]+numbers[right]>target)
				right--;
			else if(numbers[left]+numbers[right]<target)
				left++;
			else
				return new int[]{left+1, right+1}; //1 based indexing
		}
			return null;
	}

}
