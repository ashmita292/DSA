package com.ashmita.array;

/**
 * 
 * @author User
 * TC: O(n)
 * AS: O(1)
 * Hint: Have a count of the non zero number index
 *
 */
public class MoveZerosToEndOfArray {

	public static void main(String[] args) {
			int[] arr = {12, 13, 0, 0, 8, 0, 0};
			moveZerosToEnd(arr);
			for(int a:arr) {
				System.out.println(a);
			}
	}

	private static void moveZerosToEnd(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				//swap arr[i] and arr[count]
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}

}
