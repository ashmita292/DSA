package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * We are given an array of 2 types of elements 
 * 1. Segregate positive and negative numbers (order can be anything)
 * 2. Segregate even and odd numbers 
 * 3. Segregate binary numbers 
 * 
 * Efficient solution: use hoare's partition
 * 
 * TC: O(N) AS: O(1)
 *
 */

public class SortAnArraywithTwoTypes {

	public static void main(String[] args) {
		int[] arr = { 8, -9, 3, -6, 5, -10, 4 };
		segregatePositiveNegative(arr);
		System.out.println("Sort array with two types: " + Arrays.toString(arr));
	}

	private static void segregatePositiveNegative(int[] arr) {
		int i = -1, j = arr.length;
		while (true) {
			do {
				i++;
			} while (arr[i] < 0);
			do {
				j--;
			} while (arr[j] >= 0);

			if (i >= j)
				return;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
