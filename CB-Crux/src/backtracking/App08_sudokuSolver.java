package backtracking;

import java.util.Scanner;

public class App08_sudokuSolver {

	static void display(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	static boolean isItSafeRow(int[][] board, int row, int col, int val) {
		for (int c = 0; c < board[0].length; c++) {
			if (board[row][c] == val) {
				return false;
			}
		}
		return true;
	}

	static boolean isItSafeCol(int[][] board, int row, int col, int val) {
		for (int r = 0; r < board.length; r++) {
			if (board[r][col] == val) {
				return false;
			}
		}
		return true;
	}

	static boolean isItSafeCell(int[][] board, int row, int col, int val) {
		int bsr = row - row % 3;
		int bsc = col - col % 3;
		for (int r = bsr; r < bsr + 3; r++) {
			for (int c = bsc; c < bsc + 3; c++) {
				if (board[r][c] == val) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean isItSafe(int[][] board, int row, int col, int val) {
		return isItSafeRow(board, row, col, val) && isItSafeCol(board, row, col, val)
				&& isItSafeCell(board, row, col, val);
	}

	static void suduko(int[][] board, int row, int col) {

		// negative base case
		if (col == board[0].length) {
			col = 0;
			row++;
		}
		// possitive base case
		if (row == board.length) {
			display(board);
			return;
		}
		// if value is already placed skip that call
		if (board[row][col] != 0) {
			suduko(board, row, col + 1);
			return;
		}
		// give 9 calls for each block of suduko
		for (int i = 1; i <= 9; i++) {
			if (isItSafe(board, row, col, i)) {
				board[row][col] = i;
				suduko(board, row, col + 1);
				board[row][col] = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] board = new int[9][9];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = scanner.nextInt();
			}
		}
		suduko(board, 0, 0);
	}
}
