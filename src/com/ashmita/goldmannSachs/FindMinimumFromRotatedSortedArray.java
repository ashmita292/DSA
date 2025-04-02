package com.ashmita.goldmannSachs;
/**
 * 
 * @author User
 * TC:O(logN)
 *
 */

public class FindMinimumFromRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 1, 2};
		int ans = findMinInRotatedSortedArray(arr);
		System.out.println("Minimum number from rotated sorted array is " + ans);

	}

	private static int findMinInRotatedSortedArray(int[] arr) {
		int left =0;
		int right = arr.length-1;
		while(left<right) {
			int mid = left + (right-left)/2;
			if(arr[mid] > arr[right]) {
				left = mid +1;
			}else {
				right = mid;
			}
		}
		return arr[left];
	}

}
