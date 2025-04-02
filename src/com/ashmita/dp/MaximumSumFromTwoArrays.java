package com.ashmita.dp;

/**
 * 
 * @author User Modified Version : We are given ‘2’ arrays . Select some
 *         elements from both of these arrays (select a subset) such that:-
 *         --->1. Sum of those elements is maximum(Sum of the subset is
 *         maximum). 
 *         --->2. No 2 elements in the subset should be
 *         consecutive.
 *         (Note:-If you select, say the 5th element from Array-1,
 *         then you are not allowed to select 4th element from either Array-1 or
 *         Array-2 nor are you allowed to select the 5th element from Array -2
 *         all of them are considered consecutive :-) ) 
 *         Example:-> 
 *         Array 1(a1) : {1,5,3,21234} 
 *         Array 2(a2) : {-4509,200,3,40} 
 *         Answer:- (200+21234=21434)
 *
 */

public class MaximumSumFromTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,5,3,21234} ;
		int[] arr2 = {-4509,200,3,40};
		int[] dp = new int[arr1.length];
		dp[0] = Math.max(arr1[0], arr2[0]);
		dp[1] = Math.max(arr1[1], arr2[1]);
		for(int i=3; i<arr1.length; i++) {
			dp[i] = Math.max(Math.max(arr1[i], arr2[i]) + dp[i-2], dp[i-1]);
		}
		System.out.println("Maximum sum subarra from 2 arrays is " + dp[arr1.length-1]);

	}

}
