package com.ashmita.array;
/**
 * 
 * @author User
 * Hint: 
 * 1. Traverse through all ranges and mark the beginning and ending in freq[]
 * 2. Do prefix sum in the freq[] array
 * 3. Return the index of the maximum value
 * 
 * TC: O(N+max), where max =100
 *
 */

public class MaximumAppearingElement {

	public static void main(String[] args) {
		int[] left = {1, 2, 4};
		int[] right = {4,5,7};
		int n=3;
		int ans = maximumAppearingElement(left, right, n);
		System.out.println("The maximum appearing element is "+ ans);
	}

	private static int maximumAppearingElement(int[] left, int[] right, int n) {
		int[] freq = new int[100];
		for(int i=0;i<n;i++) {
			freq[left[i]] =1;
			freq[right[i]+1] = -1;
			
		}
		int res= 0;
		for(int i= 1;i<100;i++) {
			freq[i] = freq[i-1]+ freq[i];
			if(freq[i]>freq[res])
				res=i;
		}
		return res;
	}

}
