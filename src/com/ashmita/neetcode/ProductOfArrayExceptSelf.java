package com.ashmita.neetcode;

import java.util.Arrays;

/**
 * 
 * @author User
 * TC: O(2N)
 * AS: O(1)
 * Sol: Take two variables pre adn post and create an answer array,
 * where inplace we will calculate all the values and place it
 *
 */

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] ans =productExceptSelf(nums);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int pre =1 , post =1;
		for(int i=0; i<nums.length; i++) {
			result[i] = pre;
			pre = nums[i] * pre;
		}
		for(int i= nums.length-1; i>=0; i--) {
			result[i]= result[i] * post;
			post = nums[i] * post;
		}
		return result;
	}

}
