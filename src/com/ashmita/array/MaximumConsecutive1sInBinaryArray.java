package com.ashmita.array;

/**
 * 
 * @author User
 * Take 2 variables res and curr
 * Res stores the maximum consecutive ones in binary array(because
 * there can be many consecutive ones present separately.)
 * And curr stores the total number of 1's in a sequence.
 * TC: O(N)
 * AS: O(1)
 *
 */

public class MaximumConsecutive1sInBinaryArray {

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 1, 1, 1};
		int ans = maxConsecutiveOnes(arr);
		System.out.println("The maximum of ones is "+ ans);
	}

	private static int maxConsecutiveOnes(int[] arr) {
		int res=0, curr=0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i]==0) {
				curr=0;
			}
			else {
				curr++;
				res = Math.max(curr, res);
			}
		}
		return res;
	}

}
