package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * @author User
 * Problem: Find the kth smallest element from an unsorted array(k<= size of array)
 * Hint: Sort the array and return the kth smallest element . do using lomuto algorithm
 * This solution is actually an algorithm known as quick started algorithm
 * 
 * TC: O(NlogN)
 * AS: O(N)
 * 
 *
 */

public class KthSmallestElementInAnArray {

	public static void main(String[] args) {
		int[] arr= {8, 9, 3, 6, 5, 10, 4};
		int k = 4;
		int res =  kthSmallest(arr, 0, arr.length-1, k);
		System.out.println("kth smallest element is "+ res);
	}

	private static int kthSmallest(int[] arr, int low, int high, int k) {
		while(low<=high) {
			int p = partition(arr, low, high);
			if(p==k-1) return arr[p];
			if(p>k-1)high= p-1;
			if(p<k-1)low= p+1;
		}
		return -1;
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] =temp;
		return i+1;
	}

}
