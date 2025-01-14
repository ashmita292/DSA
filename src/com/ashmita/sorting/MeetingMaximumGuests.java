package com.ashmita.sorting;

import java.util.Arrays;

/**
 * 
 * @author User
 * Problem: Given two arrays of arrival and departure. Figure out the maximum
 * number of guests he can meet.
 * arr[]={900, 600, 700} => 600 = 6:00
 * dep[] = {1000, 800, 730}
 * 
 * Hint: Sort the array and use the merge function
 */

public class MeetingMaximumGuests {

	public static void main(String[] args) {
		int[] arr = {900, 600, 700 };
		int[] dep = {1000, 800, 730};
		int ans = maxguests(arr, dep);
		System.out.println("Maximum number of guests he can meet is " + ans);

	}

	private static int maxguests(int[] arr, int[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1, j=0, curr=1, res=1;
		while(i<arr.length && j<dep.length) {
			if(arr[i]<dep[j]) {
				curr++;
				i++;
			}else {
				curr--;
				j++;
			}
			res = Math.max(curr, res);
			
		}
		return res;
	}

}
