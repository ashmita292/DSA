package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * @author User
 * Advantages of selection sort:
 * 1. TC: o(n^2) (Both in sorted and unsorted array - it always takes n^2 time complexity)
 * 2. does less memory writes compared to quick sort, merge sort, insertion sort.
 * But cycle sort is optimal compared to memory writes
 * 3. not stable (order of elements may change)
 * 4. basic idea for heap sort
 * 5. in place algorithm(it does not require extra space for sorting)
 * 
 * Hint: Find the minimum element and put in the first place
 *
 */

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5, 0, 6, 2, 3};
		int[] ans = selectionSort(arr);
		System.out.println("The sorted array using selection sort is "+ Arrays.toString(ans));
	}

	private static int[] selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex= i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
