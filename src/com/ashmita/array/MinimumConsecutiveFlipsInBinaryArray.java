package com.ashmita.array;

/**
 * 
 * @author User
 * Hint: Always start with the second consecutive sequence and compare with
 * first element. That gives the minimum number of flip or same flip
 * Two cases are there:
 * 1. either the first element and last element is same(it gives the one less flip)
 * 2. or the first element and last element is different(it gives same number of flips)
 * 
 * TC: O(N)
 * AS: O(1)
 *
 */
public class MinimumConsecutiveFlipsInBinaryArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 0, 0, 1, 1, 0, 0, 1};
		printGroupsToFlip(arr);
	}

	private static void printGroupsToFlip(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				if(arr[i]!=arr[0]) 
					System.out.print("Flip from " + i);
				else
					System.out.println(" to " + (i-1));
			}
		}
		if(arr[arr.length-1]!=arr[0]) {
			System.out.print(" to " + (arr.length-1));
		}
	}

}
