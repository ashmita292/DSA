package com.ashmita.array;

/**
 * 
 * @author User
 * TC: O(d+n-d+n) = O(n)
 * AS: O(1)
 *
 */
public class LeftRotateAnArrayByd {

	public static void main(String[] args) {
		int[] arr = {12, 13, 9, 5, 30};
		int d = 2;
		leftRotateByd(arr, d);
		for(int a:arr) {
			System.out.println(a);
		}
	}

	private static void leftRotateByd(int[] arr, int d) {
		int n= arr.length;
		reverseArr(arr, 0, d-1);
		reverseArr(arr, d, n-1);
		reverseArr(arr, 0, n-1);
	}

	private static void reverseArr(int[] arr, int low, int high) {
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

}
