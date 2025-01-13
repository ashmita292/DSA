package com.ashmita.array;

/**
 * 
 * @author Ashmita Senapati
 * array should be sorted in the increasing order
 * Time complexity: O(n)
 *
 */

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] arr = {10, 5, 30, 40};
		boolean ans = isArraySorted(arr);
		System.out.println("Array is sorted: "+ ans);
	}
	
	private static boolean isArraySorted(int[] arr) {
		boolean flag= true;
		for(int i=1;i<arr.length; i++) {
			if(arr[i]< arr[i-1]) {
				flag = false;
			}
		}
		return flag;
	}

}
