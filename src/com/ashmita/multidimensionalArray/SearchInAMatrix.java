package com.ashmita.multidimensionalArray;
/**
 * 
 * @author User
 * rows and column are sorted
 * Solution: 
 * 1. Begin from the top right corner
 * 2. if x is same, print the position and return
 * 3. if x is smaller, move left
 * 4. if x is greater, move down
 * 
 * Tip: Either start from top right or bottom left
 * 
 * TC: O(r+c)
 */
public class SearchInAMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 5 }, { 4, 6, 9 }, { 5, 7, 90 }};
		int n=3;
		int x= 100;
		search(arr, n, x);
	}

	private static void search(int[][] arr, int n, int x) {
		int i=0, j=n-1;
		if(x<arr[0][0] || x>arr[n-1][n-1]) {
			System.out.println("Not Found");
			return;
		}
		while(i<n && j>=0) {
			if(x==arr[i][j]) {
				System.out.println("Found at ("+ i + "," + j + ")");
				return;
			}
			else if(x<arr[i][j]) j--;
			else i++;
		}
		System.out.println("Not Found");
		
	}

}
