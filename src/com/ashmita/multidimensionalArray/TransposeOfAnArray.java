package com.ashmita.multidimensionalArray;

/**
 * 
 * @author User 
 * Transpose of an array means , the rows becomes the columns and
 *         the columns becomes the row
 * Given an nxn matrix	
 * swapping the upper diagonal element with lower diagonal element
 * 
 * TC: O(n^2)
 * AS: O(1)
 *
 */
public class TransposeOfAnArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 5 }, { 4, 6, 9 }, { 5, 7, 90 }};
		int n=3;
		int[][] ans = transposeOfMatrix(arr, n);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

	private static int[][] transposeOfMatrix(int[][] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		return arr;
	}

}
