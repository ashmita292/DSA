package com.ashmita.array;

/**
 * 
 * @author User
 * Hint: Run a loop. If the element is same as the previous element,
 * increment the counter(i) and frequency by 1
 * else print the element and increase i and reset frequency to 1
 * 
 * TC: O(N)
 *
 */
public class FrequenciesInASortedArray {

	public static void main(String[] args) {
		int[] arr = {100, 100, 2, 2, 40, 40, 30};
		printFrequency(arr);
	}

	private static void printFrequency(int[] arr) {
		int n= arr.length, i=1, freq=1;
		while(i<n) {
			while(i<n && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i-1] + " " + freq);
			freq = 1;
			i++;
		}
		if(n==1 || arr[n-1]!=arr[n-2]) { //if the last element is different or array size is 1
			System.out.println(arr[n-1] + " 1");
		}
	}

}
