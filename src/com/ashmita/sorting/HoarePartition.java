package com.ashmita.sorting;
/**
 * 
 * @author User
 *Hoare's partition is better than lomuto partition
 * TC: O(N)
 * AS: O(1)
 * 
 * Hint:
 * Assume arr[low] is the pivot element 
 * Start from i=low-1 and j=high+1;
 * if ith element is less than pivot , do i++;
 * if jth element is greater than pivot, do j--;
 * if i>-j, return j;
 * else swap arr[i], arr[j];
 * 
 * NOTE:
 * 1. Lomuto partition(not stable) ensures that pivot is at the correct place once partition is done
 * 2. Hoare's partition(not stable) just ensures that all the elements to the left of j is smaller
 * than the pivot and vice versa.
 * 3. But in general Hoare's partition is better on an average
 * 
 */

public class HoarePartition {

	public static void main(String[] args) {
		int[] arr= {4, 7, 3, 1, 5};
		int low=0, high=arr.length-1;
		int ans = partition(arr, low, high);
		System.out.println("The index of the pivot element is "+ ans);

	}

	private static int partition(int[] arr, int low, int high) {
		int i=low-1, j=high+1;
		int pivot = arr[low];
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j)return j;
			int temp= arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
		}		
	}

}
