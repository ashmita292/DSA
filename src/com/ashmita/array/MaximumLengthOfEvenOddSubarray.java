package com.ashmita.array;

/**
 * 
 * @author User
 * This solution is based on Kadane's algorithm
 * TC: O(N)
 * AS: O(1)
 *
 */
public class MaximumLengthOfEvenOddSubarray {

	public static void main(String[] args) {
		int[] arr = {5, 1, 21, 6, 3, 8};
		int ans = maxEvenOdd(arr);
		System.out.println("The maximum length of even odd subarray is "+ ans);
	}

	private static int maxEvenOdd(int[] arr) {
		int res=1, curr=1;
		for(int i=1;i<arr.length;i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)) {
				curr++;
				res = Math.max(curr, res);
			}else {
				curr=1;
			}
		}
		return res;
	}

}
