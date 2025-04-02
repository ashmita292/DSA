package com.ashmita.neetcode;
/**
 * 
 * @author User
 * Use 2 poinyter approach. we will calculate the area with
 * minimum height and check for the minimum height. If left 
 * pointer has minimum height we will move the left pointer forward
 * else right pointer
 * TC: O(N)
 * AS: O(1)
 *
 */

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int ans = maxArea(height);
		System.out.println(ans);
	}

	private static int maxArea(int[] height) {
		int max =0;
		int left = 0;
		int right = height.length-1;
		while(left<right) {
			int width = right - left;
			int area = Math.min(height[left], height[right])*width;
			max = Math.max(max, area);
			if(height[left]<= height[right])
				left++;
			else
				right--;
		}
		return max;
	}

}
