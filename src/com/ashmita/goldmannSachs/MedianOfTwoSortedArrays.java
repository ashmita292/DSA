package com.ashmita.goldmannSachs;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 7, 8 };
		int[] nums2 = { 2, 4, 6, 9 };
		double ans = findMedianSortedArrays(nums1, nums2);
		System.out.println(ans);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		int n = n1 + n2;
		int[] new_arr = new int[n];
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (nums1[i] < nums2[j]) {
				new_arr[k] = nums1[i];
				i++;
			} else {
				new_arr[k] = nums2[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			new_arr[k] = nums1[i];
			i++;
			k++;
		}
		while (j < n2) {
			new_arr[k] = nums2[j];
			j++;
			k++;
		}
		if (n % 2 == 0)
			return (float) (new_arr[n / 2 - 1] + new_arr[n / 2]) / 2;
		else
			return new_arr[n / 2];
	}
}
