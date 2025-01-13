package com.ashmita.array;

/**
 * 
 * logic: 
 * res = -1, largest = 0
 * if(arr[i]>arr[largest]) -> res=largest, largest=i
 * if(arr[i]==arr[largest]) -> ignore
 * if(arr[i]<arr[largest]) -> 
 * 	1. if(res==-1) -> res=i
 * 	2. if(arr[i]<arr[res]) -> ignore
 * 	3. if(arr[i]>arr[res]) -> res=i
 * 
*/

public class SecondLargestElementInArray {
	

	public static void main(String[] args) {
		int[] arr = {10, 10, 10, 5};
//		int[] arr = {10, 70,30, 5, 60, 100, 20};
		int ans = getSecondlargest(arr);
		System.out.println("The second largest element in the array is "+ ans);
	}

	private static int getSecondlargest(int[] arr) {
		int res = -1, largest = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[largest]) {
				res=largest;
				largest=i;
			}
			else if(arr[i] != arr[largest]) {
				if(res==-1 || arr[i]>arr[res])
					res=i;
			}	
		}
		return res;
	}

}
