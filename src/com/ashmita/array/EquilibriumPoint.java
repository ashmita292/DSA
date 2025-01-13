package com.ashmita.array;

/**
 * 
 * @author User
 * A point is called the equilibrium point if the left sum and 
 * right sum are same
 * TC: O(N)
 * AS: O(1)
 *
 */
public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 4, 1};
		boolean ans = ePoint(arr);
		System.out.println("Is equilibrium point present: " + ans);
	}

	private static boolean ePoint(int[] arr) {
		int rightSum = 0;
		for(int i=0; i<arr.length; i++)
		{
			rightSum += arr[i]; //total sum
		}
		int leftSum = 0;
		for(int i=0; i<arr.length; i++) {
			rightSum-=arr[i];
			if(leftSum == rightSum) return true;
			leftSum += arr[i];
		}
		return false;
	}

}
