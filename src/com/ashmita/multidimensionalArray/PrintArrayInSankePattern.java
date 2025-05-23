package com.ashmita.multidimensionalArray;

public class PrintArrayInSankePattern {

	public static void main(String[] args) {
		int[][] arr = {{1,3, 5}, {4,6,9}, {5, 7,90}, {2, 6, 9}};
		snakePattern(arr);
	}

	private static void snakePattern(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2 == 0) {
				for(int j=0; j<arr[i].length;j++) {
					System.out.print(arr[i][j] + " ");
				}
			}else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
}
