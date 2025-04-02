package com.ashmita.multidimensionalArray;
/**
 * 
 * @author User
 * Time complexity is O(r+c)
 *
 */
public class PrintBoundaryElements {

	public static void main(String[] args) {
		int[][] arr = {{1,3, 5}, {4,6,9}, {5, 7,90}, {2, 6, 9}};
		boundaryElements(arr);
	}

	private static void boundaryElements(int[][] arr) {
		int row = arr.length;
		int col=arr[0].length;
		
		if(row==1) {
			for(int i=0;i<arr[row].length;i++){
				System.out.print(arr[0][i] + " ");
			}
		}else if(col==1) {
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i][0]);
			
		}else {
			for(int i=0; i<arr[i].length;i++)
				System.out.print(arr[0][i] + " ");
			for(int i =1; i<arr.length;i++)
				System.out.print(arr[i][col-1] + " ");
			for(int i= col-2; i>=0;i--)
				System.out.print(arr[row-1][i] + " ");
			for(int i=row-2;i>=1;i--)
				System.out.print(arr[i][0] + " ");
		}
	}

}
