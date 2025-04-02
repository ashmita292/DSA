package com.ashmita.multidimensionalArray;
/**
 * 
 * @author User
 * Take four variables top, bottom, left, right
 * TC: O(rxc)
 *
 */
public class PrintSpiralArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 5 }, { 4, 6, 9 }, { 5, 7, 90 } };
		int n = 3;
		printSpiralArray(arr, n);
}

	private static void printSpiralArray(int[][] arr, int n) {
		int top=0, bottom =n-1, left=0, right=n-1;
		while(top<=bottom && left <= right) {
			for(int i=left;i<=right;i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(arr[i][right]+ " ");
			}
			right--;
			if(top<=bottom) { //right column reverse order
				for(int i=right;i>=left;i--) {
					System.out.print(arr[bottom][i]+ " ");
				}
				bottom--;
			}
			if(left<=right) { //left column reverse order
				for(int i=bottom;i>=top;i--) {
					System.out.print(arr[i][left]+ " ");
				}
				left++;
			}
		}
	}
}
