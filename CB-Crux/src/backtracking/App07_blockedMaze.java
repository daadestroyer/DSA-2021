package backtracking;

public class App07_blockedMaze {

	static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visited) {

		// possitive basecase
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (row == maze.length || row == -1 || col == maze[0].length || col == -1 || maze[row][col] == 1
				|| visited[row][col]) {
			return;
		}

		// put a mark in which cell you recieved
		// true isile mark kia kyuki sabse pahle top ki call lagegi to 0,0 se -ve me chala jaega to to firse jab down ki call lagegi to 1,0 me ajaega to 1,0 ke jane ke 
		// baad firse top ki call lagegi to usko prevent karne ke lie aisa kia hai s
		visited[row][col] = true;

		// top call

		blockedMaze(maze, row - 1, col, ans + "T", visited);

		// down call
		blockedMaze(maze, row + 1, col, ans + "D", visited);

		// left call
		blockedMaze(maze, row, col - 1, ans + "L", visited);

		// right call
		blockedMaze(maze, row, col + 1, ans + "R", visited);

		visited[row][col] = false;
	}

	public static void main(String[] args) {
		int[][] maze = new int[][] { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze.length]);
	}

}
