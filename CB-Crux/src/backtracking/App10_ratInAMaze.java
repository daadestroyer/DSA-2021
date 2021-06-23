package backtracking;

/*
5 4
OXOO
OOOX
OOXO
XOOO
XXOO
*/
import java.util.Scanner;

// the rat can move down or right on the grid.
public class App10_ratInAMaze {

	static boolean solveMaze(int[][] board, int row, int col, int[][] sol) {

		if (row == board.length - 1 && col == board[0].length - 1) {
			sol[row][col] = 1;
			for (int i = 0; i < sol.length; i++) {
				for (int j = 0; j < sol[0].length; j++) {
					System.out.print(sol[i][j] + " ");
				}
				System.out.println();
			}
			return true;
		}
		if (row == board.length || col == board[0].length || board[row][col] == 1) {
			return false;
		}

		sol[row][col] = 1;
		boolean pathMila = solveMaze(board, row, col + 1, sol);

		if (pathMila) {
			
			return true;
		}

		boolean pathMila1 = solveMaze(board, row + 1, col, sol);
		if (pathMila1) {
			return true;
		}
		// backtrack
		sol[row][col] = 0;

		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] board = new int[row][col];
		int[][] sol = new int[row][col];

		for (int i = 0; i < board.length; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'X') {
					board[i][j] = 1;
				} else {
					board[i][j] = 0;
				}
			}

		}
		solveMaze(board, 0, 0, sol);

	}
}
