package com.ashmita.multidimensionalArray;
/**
 * 
 * @author User
 * 1. Arrays are not stored in contagious location
 * 2. We do not specify dimensions with array names:
 *   	=> int arr[2][3] is invalid
 *   	=> int arr[][3] is invalid
 *
 */

public class Traverse2DArray {

	public static void main(String[] args) {
		//int[][] arr = {{1,4 , 2}, {5, 9, 7}};
		int m=2, n=3;
		int [][] arr = new int[m][n];
		traverseArray(arr);
	}

	private static void traverseArray(int[][] arr) {
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
