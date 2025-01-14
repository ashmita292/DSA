package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * @author User
 * There are three possible ways this problem can be asked
 * 1. Sort an array of 0's, 1's, 2's
 * 		i/p: {0, 1, 0, 2, 1, 2}
 * 		o/p: {0, 0, 1, 1, 2, 2} 
 * 2. Three way partitioning
 * 		i/p: {2, 1, 2, 20, 10, 20, 1}, pivot = 2
 * 		o/p: {1, 1, 2, 2, 20, 10, 20}
 * 3. Partition around a range
 * 		i/p: {10, 5, 6, 3, 20, 9, 40}, range =[5, 10]
 * 		o/p: {3, 5, 6, 9, 10, 20, 40}
 * 
 * Solution: Dutch National Flag Algorithm
 * partition the array into 4 parts- 0 to low, low to mid, mid to high, high to n-1
 *
 * TC: O(N) [one traversal]
 * AS: O(1)
 */

public class SortAnArrayWithThreeTypes {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 0, 1, 2, 0, 2 };
		sort(arr);
		System.out.println("Sort array with two types: " + Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		int low=0, mid=0, high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)mid++;
			else {
				int temp = arr[mid];
				arr[mid]= arr[high];
				arr[high]= temp;
				high--;
			}
		}
	}

}
