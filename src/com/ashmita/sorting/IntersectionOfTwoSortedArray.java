package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * @author User
 * Problem: We are given two sorted array. We have to print the intersection of 2 sorted array.
 * Hint: same as merge function
 * 
 * TC: O(N+M)
 * AS: O(1)
 *
 */

public class IntersectionOfTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 6, 9, 70};
		int[] arr2 = {6, 6, 10, 50, 70, 70, 80};
		intersectionOfSortedArray(arr1, arr2);
	}

	private static void intersectionOfSortedArray(int[] arr1, int[] arr2) {
			int i=0, j=0;
			while(i<arr1.length && j<arr2.length) {
				if(i>0 && arr1[i]==arr1[i-1]) {
					i++;
					continue;
				}
				if(arr1[i]<arr2[j]) i++;
				else if(arr1[i]>arr2[j]) j++;
				else {
					System.out.println(arr1[i]);
					i++;
					j++;
				}
			}
	}

}
