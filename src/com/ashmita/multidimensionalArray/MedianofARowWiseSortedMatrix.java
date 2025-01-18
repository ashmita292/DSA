package com.ashmita.multidimensionalArray;

import java.util.Arrays;

/**
 * 
 * @author User 
 * Assumptions: 
 * 1. odd sized matrix 
 * 2. all distinct elements 
 * 3. row-wise sorted
 * 
 * Hint: Find the minimum and maximum element. Do binary search and get the median element
 * TC: O(r) + O(logc * r * log(max-min))
 * AS: O(1)
 *       
 *
 */
public class MedianofARowWiseSortedMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 10, 20 }, { 15, 25, 35 }, { 5, 30, 40 } };
		int ans = arrMedian(arr);
		System.out.println("Median is " + ans);
	}

	private static int arrMedian(int[][] arr) {
		int r = arr.length, c = arr[0].length;
		int min= arr[0][0], max= arr[0][c-1];
		for(int i=0; i<r;i++) {
			if(arr[0][i]< min) min = arr[0][i];
			if(arr[i][c-1]> max) max = arr[i][c-1];
		}
		int medPos = ((r*c)+1)/2;
		while(min<max) {
			int mid = (min+max)/2;
			int midPos = 0;
			for(int i=0;i<r;i++) {
				int pos = Arrays.binarySearch(arr[i], mid)+1;
				midPos += Math.abs(pos);
			}
			if(midPos<medPos) min= mid+1;
			else max = mid;
		}
		return min;
	}

}
