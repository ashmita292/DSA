package com.ashmita.array;

/**
 * 
 * @author Ashmita Senapati
 * Take a low and high pointer and swap it to reverse the array
 * Time complexity = o(n)
 * Auxiliary space = o(1)
 *
 */
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = {20, 30, 5, 100, 4};
		reverseArray(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	private static void reverseArray(int[] arr) {
		int n= arr.length;
		int low = 0;
		int high= n-1;
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
}
