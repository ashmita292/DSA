package com.ashmita.neetcode;
/**
 * TC: O(N^2)
 * AS: O(3n) = o(n), since n is 9 which is a constant. 
 * so, AS can be O(1)
 * Sol: Take hashset for 9 rows, 9cols, and other boxes . total 27 hashsets will be there
 */
import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
		};
		boolean ans = validSudoku(board);
		System.out.println(ans);
	}

	private static boolean validSudoku(char[][] board) {
		int N =9;
		HashSet<Character>[] rows = new HashSet[N];
		HashSet<Character>[] cols = new HashSet[N];
		HashSet<Character>[] boxes = new HashSet[N];
		
		for(int i =0; i<N;i++) {
			rows[i] = new HashSet<Character>();
			cols[i] = new HashSet<Character>();
			boxes[i] = new HashSet<Character>();
		}
		
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				char val = board[r][c];
				if(val == '.') {
					continue;
				}
				//check the rows
				if(rows[r].contains(val))
					return false;
				rows[r].add(val);
				
				//check the cols
				if(cols[c].contains(val))
					return false;
				cols[c].add(val);
				
				//check the other boxes
				int idx = (r/3)*3 + c/3;
				if(boxes[idx].contains(val))
					return false;
				boxes[idx].add(val);
			}
		}
		
		return true;
	}

}
