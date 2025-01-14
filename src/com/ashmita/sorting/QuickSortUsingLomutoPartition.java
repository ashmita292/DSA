package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * In merge sort, merge function is complex and in quick sort partition function is complex.
 * 1. divide and conquer
 * 2. Worst case time complexity- O(N^2)
 * 3. Despite of O(n^2) TC, it is compared faster, because of the following reasons:
 * 	a. in-place
 * 	b. cachce friendly
 * 	c. average case - O(nlogn)
 * 	d. tail recursive
 * 4. Partition is key function(Naive, lomuto, hoare)
 * 
 *
 */

public class QuickSortUsingLomutoPartition {

	public static void main(String[] args) {
		int[] arr= {8, 9, 3, 6, 5, 10, 4};
		qSort(arr, 0, arr.length-1);
		System.out.println("Quick sort using lomuto partition is "+ Arrays.toString(arr));
	}

	private static void qSort(int[] arr, int low, int high) {
		if(low<high) {
			int p = partition(arr, low, high);
			qSort(arr, low, p-1);
			qSort(arr, p+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int i=low-1;
		int pivot = arr[high];
		for(int j=low;j<=high-1; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

}
