package com.ashmita.neetcode;

/**
 * 
 * @author User
 * Use 2 pointer approach - Optimal solution
 * TC: O(N)
 * AS: O(1)
 *
 */
public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr = {5, 0, 6, 2, 3};
		int ans = rainWaterTrapping(arr);
		System.out.println("The maximum rain water it can trap is of height "+ ans);
	}

	private static int rainWaterTrapping(int[] height) {
		int left =0;
		int right = height.length-1;
		int total =0;
		int leftMax = height[left];
		int rightMax = height[right];
		
		while(left<right) {
			if(height[left]<height[right]) {
				leftMax = Math.max(leftMax, height[left]);
				if(leftMax - height[left]>0)
					total +=  leftMax - height[left];
				left++;
			}else {
				rightMax = Math.max(rightMax, height[right]);
				if(rightMax - height[right]>0)
					total+= rightMax - height[right];
				right--;
			}
		}
		return total;
	}

}
