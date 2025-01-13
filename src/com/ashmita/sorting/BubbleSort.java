package com.ashmita.sorting;
/**
 * 
 * Stable sort
 * Hint: It checks the adjacent element and 
 * if the element is greater than the next element, 
 * swap it. Put the largest element at the end.
 * 
 * TC: O(N^2)
 * AS: O(1)
 * 
 */

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5, 0, 6, 2, 3};
		int[] ans = bubbleSort(arr);
		System.out.println("The sorted array using bubble sort is "+ Arrays.toString(ans));
	}

	private static int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean swapped=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]  = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
		return arr;
	}

}
