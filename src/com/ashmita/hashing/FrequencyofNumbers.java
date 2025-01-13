package com.ashmita.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyofNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the number: ");
			arr[i] = sc.nextInt();
			int freq = map.getOrDefault(arr[i], 0);
			map.put(arr[i], freq+1);
		}
		
		System.out.println("Enter the size of the query: ");
		int query = sc.nextInt();
		for(int j=0; j<query; j++) {
			System.out.println("Enter the number to get the frequency: ");
			int q = sc.nextInt();
			System.out.println("Answer: The frequency of "+ q + ": " + map.getOrDefault(q,0));
		}
	}

}
