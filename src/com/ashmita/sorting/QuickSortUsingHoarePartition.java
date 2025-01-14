package com.ashmita.sorting;
/**
 * Hoare partition is faster than lomuto partition
 * Both lomuto and hoare partition are not stable
 * Naive partition is stable 
 * 
 * Same time complexity for all types of quick sort
 * Worst case time complexity: T(n-1)+O(n)
 * Best case time complexity: 2T(n/2)+O(n)
 * Average case time complexity: O(nlogn)
 * 
 * AS: O(N)
 */

import java.util.Arrays;

public class QuickSortUsingHoarePartition {

	public static void main(String[] args) {
		int[] arr= {8, 9, 3, 6, 5, 10, 4};
		qSort(arr, 0, arr.length-1);
		System.out.println("Quick sort using hoare partition is "+ Arrays.toString(arr));
	}

	private static void qSort(int[] arr, int low, int high) {
		if(low<high) {
			int p =partition(arr, low, high);
			qSort(arr, low, p);
			qSort(arr, p+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i=low-1, j= high+1;
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j) return j;
			int temp= arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
				
		}
	}

}
