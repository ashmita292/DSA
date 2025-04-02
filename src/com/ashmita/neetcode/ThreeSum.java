package com.ashmita.neetcode;
/**
 * Use two pointer approach. Can also use thehashing approach
 * TC: O(N^2) +  O(NlogN)
 * AS: O(N)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threeSum(nums);
		for(List<Integer> num: ans) {
			System.out.print(num + " ");
		}
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0; i<nums.length && nums[i]<=0;i++) {
			if(i==0 || nums[i]!=nums[i-1])
				twoSum2(nums, i, result);
		}
		return result;
	}

	private static void twoSum2(int[] nums, int i, List<List<Integer>> result) {
		int left = i+1;
		int right = nums.length-1;
		while(left<right) {
			int sum = nums[i]+ nums[left]+nums[right];
			if(sum>0)
				right--;
			else if(sum<0)
				left++;
			else {
				result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
				while(left<right && nums[left] == nums[left-1])
					left++;
			}
		}
		
	}

}
