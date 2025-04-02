package com.ashmita.neetcode;
/**
 * 
 * @author User
 * TC: O(N)
 * AS: O(1)
 *
 */

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int ans  = maxProfit(prices);
		System.out.println(ans);
	}

	private static int maxProfit(int[] prices) {
		int min =prices[0];
		int profit =0;
		for(int i=0; i<prices.length; i++) {
			if(prices[i]< min)
				min = prices[i];
			profit = Math.max(profit, prices[i]-min);
		}
		return profit;
	}

}
