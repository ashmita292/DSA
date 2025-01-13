package com.ashmita.array;

/**
 * 
 * @author User
 * Time complexity: O(n)
 * Auxiliary space: O(1)
 * start from index 1 and compare with res-1(have another index res @1).
 * If two elements are different place the element at  that index.
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = {3, 3, 4, 5, 6, 6, 7, 10, 10};
		int ans = removeDuplicatesFromArray(arr);
		System.out.println("The size of the array now is "+ ans);

	}

	private static int removeDuplicatesFromArray(int[] arr) {
		int res=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}

}
