package com.ashmita.sorting;
/**
 * 
 * @author User
 * a pair (a[i], a[j]) forms an inversion when i<j and a[j]>a[j] 
 * when an array is sorted in increasing order, there are 0 inversions
 * When an array is sorted in decreasing order, there are n(n-1)/2 inversions
 * Suppose (x,y) is the pair. S, the possibilities are:
 * 1. both x,y can be present in the left half.
 * 2. both x,y can be present in the right half.
 * 3. x can be present in the left half and y can be present in the right half	
 * 
 * TC: O(Nlogn)
 * AS: O(n)
 *
 */
public class CountInversionsInAnArray {

	public static void main(String[] args) {
		int[] arr= {4, 7, 3, 1, 5};
		int low =0, high = arr.length-1;
		int res = countInversion(arr,low, high);
		System.out.println("Count of inversion pair is "+ res);

	}

	private static int countInversion(int[] arr, int low, int high) {
		int res=0;
		if(low<high) {
			int mid = low + (high-low)/2;
			res+= countInversion(arr, low, mid);
			res+= countInversion(arr, mid+1, high);
			res+= countAndMergeInversion(arr, low, mid, high);
		}
		return res;
	}

	private static int countAndMergeInversion(int[] arr, int low, int mid, int high) {
		int res =0;
		int n1 = mid-low+1;
		int n2 = high-mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]= arr[low+i];
		}
		for(int j=0;j<n2;j++) {
			right[j] = arr[mid+j+1];
		}
		int i=0,j=0,k=low;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k]=right[j];
				j++;
				res+=n1-i;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]= right[j];
			j++;
			k++;
		}
		return res;
	}

}
