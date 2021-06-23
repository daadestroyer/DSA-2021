package backtracking;

public class App09_countNQueen {

	static boolean isItSafe(boolean[][] board, int row, int col) {
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}
		// case-4 horizontally left
		for (int i = row, j = col - 1; j >= 0; j--) {
			if (board[i][j]) {
				return false;
			}
		}
		return true;
	}

	static int countNQueen(boolean[][] board, int row) {
		int count = 0;

		if (row == board.length) {
			return 1;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count += countNQueen(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int boardsize = 4;
		boolean[][] board = new boolean[boardsize][boardsize];
		System.out.println(countNQueen(board, 0));
	}
}
