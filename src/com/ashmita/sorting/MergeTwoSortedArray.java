package com.ashmita.sorting;
/**
 * 
 * Hint: Take two pointers at arr1[0] and arr2[0] and then compare each element
 * if the element is less than the other element , print it
 * 
 * TC: O(N+M)
 * AS: O(1)
 * 
 */

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7 , 8, 10};
		int[] arr2 = {1, 5, 9, 13, 15, 20};
		mergeSortedArray(arr1, arr2);
	}

	private static void mergeSortedArray(int[] arr1, int[] arr2) {
		int i= 0, j=0;
		while(i< arr1.length && j<arr2.length) {
			if(arr1[i]<= arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			}else {
				System.out.print(arr2[j] + " ");
				j++;
			}
		}
		while(i<arr1.length) {
			System.out.print(arr1[i] + " ");
			i++;
		}
		while(j<arr2.length) {
			System.out.print(arr2[j] + " ");
			j++;
		}
			
	}

}
