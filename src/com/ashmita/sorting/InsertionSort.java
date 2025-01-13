package com.ashmita.sorting;
/**
 * 
 * TC: O(N^2) - in worst case
 * 1. in place(doesn't require any extra space) and stable
 * 2. Used in practice for small arrays(TimSortand IntraSort)
 * 3. Takes O(N) time complexity in the best case
 * 
 */

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5, 0, 6, 2, 3};
		int[] ans = insertionSort(arr);
		System.out.println("The sorted array using insertion sort is "+ Arrays.toString(ans));
	}

	private static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		return arr;
	}

}
