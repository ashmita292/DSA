package com.ashmita.goldmannSachs;

public class RockCollectorDP {
	public static void main(String[] args) {
	    doTestsPass();
	}

	// Additional test cases
	public static void doTestsPass() {
	    int[][] grid1 = {
	        {0, 0, 0, 0, 5},
	        {0, 1, 1, 1, 0},
	        {2, 0, 0, 0, 0}
	    };

	    int result1 = optimalPath(grid1);
	    System.out.println("Test 1: " + (result1 == 10));  // Expected output: 10

	    int[][] grid2 = {
	        {0, 0, 0, 0, 10},
	        {0, 1, 1, 1, 1},
	        {1, 0, 0, 0, 0}
	    };

	    int result2 = optimalPath(grid2);
	    System.out.println("Test 2: " + (result2 == 15));  // Expected output: 12
	}

	private static int optimalPath(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[][] dp = new int[row][col];
		
		//fill the bottom left element first
		dp[row-1][0] = grid[row-1][0];
		
		//fill the last row
		for(int j= 1; j<col; j++) {
			dp[row-1][j] = dp[row-1][j-1] + grid[row-1][j];
		}
		
		//fill the first column
		for(int i= row-2; i>=0; i--) {
			dp[i][0] = dp[i+1][0] + grid[i][0];
		}
		
		//fill the rest of the DP table by considering the maximum from either the left or bottom
		for(int i= row-2; i>=0; i--) {
			for(int j = 1; j<col; j++) {
				dp[i][j] = grid[i][j] + Math.max(dp[i][j-1], dp[i+1][j]);
			}
		}
		return dp[0][col-1];
	}

	

}
