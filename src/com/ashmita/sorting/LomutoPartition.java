package com.ashmita.sorting;
/**
 * 
 * @author User
 * Assume the pivot element is the last element.
 * Now have all the smaller elements to the left of pivot and  right element to the right
 * of pviot.
 * Maintain the count of smaller window(i, which is -1 at the beginning.) 
 * NOTE: It places the pivot element in the correct place
 *
 */

public class LomutoPartition {

	public static void main(String[] args) {
		int[] arr= {4, 7, 3, 1, 5};
		int low=0, high= arr.length-1;
		int ans = lomutoPartition(arr, low, high);
		System.out.println("The index of the pivot element is "+ ans);
	}

	private static int lomutoPartition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i= low-1;
		for(int j =low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp= arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		//swap the pivot element with arr[i+1]
		int temp= arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

}
