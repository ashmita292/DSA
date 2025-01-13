package com.ashmita.array;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int[] arr = {10, 9, 60, 50, 40, 2};
		int ans = maxProfit(arr);
		System.out.println("The maximum profit is "+ ans);
	}

	private static int maxProfit(int[] arr) {
		int profit =0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				profit += (arr[i]-arr[i-1]); 
			}
		}
		return profit;
	}

}
