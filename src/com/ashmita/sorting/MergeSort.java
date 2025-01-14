package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * @author User
 * Given an array with 2 sorted parts
 * TC: O(Nlogn)
 * AS: O(N)
 * If you want stability , then merge sort is preferred 
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {1,6, 9, 5, 7};
		int low =0, high = arr.length;
		mergeSort(arr, low, high);
		System.out.println("Sorted array is "+ Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if(high>low) { //array should contain at least 2 elements
			int mid = low + (high-low)/2; //this is similar to (low+high)/2
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int n1= mid-low+1;
		int n2= high-mid;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i=0;i<n1;i++) {
			arr1[i] = arr[low+i];
		}
		for(int j=0;j<n2;j++) {
			arr2[j] = arr[mid+j+1];
		}
		
		int i=0, j=0, k=low;
		while(i<n1 && j<n2) {
			if(arr1[i]<= arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

}
