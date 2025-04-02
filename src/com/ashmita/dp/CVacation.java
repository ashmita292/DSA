package com.ashmita.dp;

/**
 * 
 * @author User Taro's summer vacation starts tomorrow, and he has decided to
 *         make plans for it now.
 * 
 *         The vacation consists of N days. For each i ( 1≤i≤N), Taro will
 *         choose one of the following activities and do it on the i-th day:
 * 
 *         A: Swim in the sea. Gain a i ​ points of happiness. B: Catch bugs in
 *         the mountains. Gain b i ​ points of happiness. C: Do homework at
 *         home. Gain c i ​ points of happiness. As Taro gets bored easily, he
 *         cannot do the same activities for two or more consecutive days.
 * 
 *         Find the maximum possible total points of happiness that Taro gains.
 *
 */

public class CVacation {

	public static void main(String[] args) {
		int[][] arr = {
				{10, 40, 70},
				{20, 50, 80},
				{30, 60, 90}
		};
		getMaximumPoints(arr);  //when 1 thing cannot be done consecutively for 2 days
		getMaximumPointsForTaro(arr);
		
	}

	private static void getMaximumPointsForTaro(int[][] arr) {
		long[] dpa = new long[arr[0].length];
		long[] dpb = new long[arr[0].length];
		long[] dpc = new long[arr[0].length];
		
		dpa[0] = arr[0][0];
		dpb[0] = arr[0][1];
		dpc[0] = arr[0][2];
		
		if(arr.length>1) {
			dpa[1] = arr[1][0] + Math.max(dpb[0], dpc[0]);
			dpb[1] = arr[1][1] + Math.max(dpa[0], dpc[0]);
			dpc[1] = arr[1][2] + Math.max(dpa[0], dpb[0]);
		}
		
		for(int i=2; i<arr.length; i++) {
			dpa[i] = Math.max(
					arr[i][0]+ Math.max(dpb[i-1], dpc[i-1]), 
					arr[i][0]+arr[i-1][0]+ Math.max(dpb[i-2], dpc[i-2]));
			dpb[i] = Math.max(
					arr[i][1]+ Math.max(dpa[i-1], dpc[i-1]), 
					arr[i][1]+arr[i-1][1]+ Math.max(dpa[i-2], dpc[i-2]));
			dpc[i] = Math.max(
					arr[i][2]+ Math.max(dpa[i-1], dpc[i-1]), 
					arr[i][2]+arr[i-1][2]+ Math.max(dpa[i-2], dpc[i-2]));
		}
		long result = Math.max(dpa[arr.length-1], Math.max(dpb[arr.length-1], dpc[arr.length-1]));
		System.out.println(result);
	}

	private static void getMaximumPoints(int[][] arr) {
		long[] dpa = new long[arr[0].length];
		long[] dpb = new long[arr[0].length];
		long[] dpc = new long[arr[0].length];
		
		dpa[0] = arr[0][0];
		dpb[0] = arr[0][1];
		dpc[0] = arr[0][2];
		
		for(int i =1; i<arr.length; i++) {
			
				dpa[i] = arr[i][0] + Math.max(dpb[i-1], dpc[i-1]);
				dpb[i] = arr[i][1] + Math.max(dpa[i-1], dpc[i-1]);
				dpc[i] = arr[i][2] + Math.max(dpa[i-1], dpb[i-1]);
			
		}
		System.out.println(Math.max(dpa[arr.length-1],
				Math.max(dpb[arr.length-1], dpc[arr.length-1])));		
	}

}
