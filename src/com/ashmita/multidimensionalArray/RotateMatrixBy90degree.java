package com.ashmita.multidimensionalArray;
/**
 * 
 * @author User
 * Rotate a matrix by 90 degree can be done in 2 step:
 * 1. Transpose the matrix
 * 2. Reverse the matrix
 * 
 * TC: O(n^2)
 * AS: O(1)
 *
 */
public class RotateMatrixBy90degree {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 5 }, { 4, 6, 9 }, { 5, 7, 90 }};
		int n=3;
		int[][] ans = rotateBy90Degree(arr, n);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

	private static int[][] rotateBy90Degree(int[][] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i=0;i<n;i++) {	
			int low = 0, high= n-1;
			while(low<high) {
				int temp = arr[low][i];
				arr[low][i] = arr[high][i];
				arr[high][i] = temp;
				low++;
				high--;
			}
		}
		return arr;
	}

}
