package com.ashmita.sorting;
/**
 * 
 * @author User
 * Hint: Same as merge function
 * TC: O(N)
 * AS: O(1)
 *
 */

public class UnionOfTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 6, 9, 70};
		int[] arr2 = {6, 6, 10, 50, 70, 70, 80};
		unionOfSortedArray(arr1, arr2);
	}

	private static void unionOfSortedArray(int[] arr1, int[] arr2) {
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length) {
			if(i>0 && arr1[i]==arr1[i-1]) {
				i++;
				continue;
			}
			if(j>0 && arr2[j]==arr2[j-1]) {
				j++;
				continue;
			}
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				System.out.print(arr2[j] + " ");
				j++;
			}else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}
		}
		while(i>0 && i<arr1.length) {
			if(arr1[i]==arr1[i-1])i++;
			System.out.print(arr1[i] + " ");
			i++;
		}
		while(j>0 && j<arr2.length) {
			if(arr2[j]==arr2[j-1]) j++;
			System.out.print(arr2[j] + " ");
			j++;
		}
	}

}
