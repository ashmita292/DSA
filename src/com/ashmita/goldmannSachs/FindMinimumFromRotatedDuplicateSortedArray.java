package com.ashmita.goldmannSachs;

public class FindMinimumFromRotatedDuplicateSortedArray {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 3, 3, 3, 3, 4, 1, 2, 3 };
		int ans = findMinimum(arr);
		System.out.println("Minimum from rotated duplicate sorted array is " + ans);
	}

	private static int findMinimum(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while(left<right) {
			int mid = left + (right-left)/2;
			if(arr[mid]> arr[right])
				left = mid+1;
			else if(arr[mid]<arr[right])
				right = mid;
			else
				right--;
		}
		return arr[left];
	}

}
