package com.ashmita.array;

/**
 * 
 * @author User
 * TC: O(n)
 * AS: O(1)
 *
 */
public class LeftRotateAnArraybyOne {

	public static void main(String[] args) {
		int[] arr = {12, 13, 9, 5, 30, 60, 2};
		leftRotateByOne(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}

	private static void leftRotateByOne(int[] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
	}

}
