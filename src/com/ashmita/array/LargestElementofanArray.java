package com.ashmita.array;

/**
 * 
 * @author User
 * TC: O(n)
 * AS: O(1)
 *
 */

public class LargestElementofanArray {
	
	public static void main(String[] args) {
		int[] arr = {10, 70,30, 5, 60, 100, 20};
		int ans = getlargest(arr);
		System.out.println("The largest element in the array is "+ ans);
	}
	
	public static int getlargest(int[] arr) {
		int res = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]> arr[res])
				res=i;
		}
		return res;
	}

}
