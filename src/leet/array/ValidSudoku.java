package leet.array;

import java.util.HashSet;
import java.util.Set;


//NOT WORKING
public class ValidSudoku {

	
	/*
	 * {{'.','.','.','.','5','.','.','1','.'},
	 * {'.','4','.','3','.','.','.','.','.'}, {'.','.','.','.','.','3','.','.','1'},
	 * {'8','.','.','.','.','.','.','2','.'}, {'.','.','2','.','7','.','.','.','.'},
	 * {'.','1','5','.','.','.','.','.','.'}, {'.','.','.','.','.','2','.','.','.'},
	 * {'.','2','.','9','.','.','.','.','.'},
	 * {'.','.','4','.','.','.','.','.','.'}};
	 */
	public static boolean isValidSudoku(char[][] board) {
		Set<Character> horizontal = new HashSet<>();
		Set<Character> vertical = new HashSet<>();
		Set<Character> subMat1 = new HashSet<>();
		Set<Character> subMat2 = new HashSet<>();
		Set<Character> subMat3 = new HashSet<>();
		int subMatCount1 = 0;
		int subMatCount2 = 0;
		int subMatCount3 = 0;
		for (int i = 0; i < 9; i++) {
			horizontal = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (addToSet(horizontal, board[i][j])) {
				} else {
					return false;
				}

				if (i >=0 && i <= 2 && j<=2) {
					subMatCount1++;
					if (addToSet(subMat1, board[i][j])) {
						if (subMatCount1==9) {
							subMat1 = new HashSet<>();
							subMatCount1=0;
						}
					} else {
						return false;
					}
				} else if (i >2 && i <= 5 && j>2 && j<=5) {
					subMatCount2++;
					if (addToSet(subMat2, board[i][j])) {
						if (subMatCount2==9) {
							subMat2 = new HashSet<>();
							subMatCount2=0;
						}
					} else {
						return false;
					}
				} else {
					subMatCount3++;
					if (addToSet(subMat3, board[i][j])) {
						if (subMatCount3==9) {
							subMat3 = new HashSet<>();
							subMatCount3=0;
						}
					} else {
						return false;
					}
				}
			} // outer for
		}
		for (int i = 0; i < 9; i++) {
			vertical = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (addToSet(vertical, board[j][i])) {
				} else {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean addToSet(Set<Character> s, Character c) {
		return c == '.' || s.add(c);
	}

	public static void main(String[] args) {
		/*char[][] board = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };*/
				
		char[][] board = new char[][]
		   {{'.','.','.','.','5','.','.','1','.'},
			{'.','4','.','3','.','.','.','.','.'},
			{'.','.','.','.','.','3','.','.','1'},
			{'8','.','.','.','.','.','.','2','.'},
			{'.','.','2','.','7','.','.','.','.'},
			{'.','1','5','.','.','.','.','.','.'},
			{'.','.','.','.','.','2','.','.','.'},
			{'.','2','.','9','.','.','.','.','.'},
			{'.','.','4','.','.','.','.','.','.'}};

		System.out.println(isValidSudoku(board));
	}
}