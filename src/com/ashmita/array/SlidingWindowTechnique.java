package com.ashmita.array;

/**
 * 
 * @author User
 * Hint: Get the sum of k elements 
 * Then add the next element and remove the first element 
 * curr + arr[i] -arr[i-k]
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */
public class SlidingWindowTechnique {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 4, 6, 5, 2, 3};
		int k=3;
		int ans = maxKElement(arr,k);
		System.out.println("The maximum sum of " + k + " elements is "+ ans);
	}

	private static int maxKElement(int[] arr, int k) {
		int curr = 0;
		for(int i=0;i<k;i++) {
			curr+= arr[i];
		}
		int res = curr;
		for(int i=k;i<arr.length;i++) {
			curr = curr + arr[i]- arr[i-k];
			res = Math.max(curr, res);
		}
		return res;
	}

}
