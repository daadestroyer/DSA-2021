package backtracking;

public class App06_queenCombination2D {
    static int count = 0;

    static void queenCombination2D(boolean[][] board, int row, int col, int queenPlaced, int totalQueen, String ans) {
        // possitive basecase
        if (queenPlaced == totalQueen) {
            count++;
            System.out.println(count + ". " + ans);
            return;
        }
        if (col == board[0].length) {
            row++;
            col = 0;
        }

        // negative basecase
        if (row == board.length) {
            return;
        }

        // queen will place
        board[row][col] = true;
        queenCombination2D(board, row, col + 1, queenPlaced + 1, totalQueen, ans + "{" + row + "-" + col + "}");

        // queen will not place
        board[row][col] = false;
        queenCombination2D(board, row, col + 1, queenPlaced, totalQueen, ans);
    }

    static void queenCombination2DKill(boolean[][] board, int row, int col, int QP, int TQ, String ans) {
        // possitive base case
        if (QP == TQ) {
            System.out.println(ans);
            return;
        }
        if (col == board[0].length) {
            row++;
            col = 0;
        }
        if (row == board.length) {
            return;
        }
        // queen will place
        if (isItSafe(board, row, col)) {
            board[row][col] = true;
            queenCombination2DKill(board, row + 1, 0, QP + 1, TQ, ans + "{" + row + "-" + col + "}");

            // queen will not place
            board[row][col] = false;
        }
        queenCombination2DKill(board, row, col + 1, QP, TQ, ans);


    }

    static boolean isItSafe(boolean[][] board, int row, int col) {
        // case-1 vertically upward
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        // case-2 vertically left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // case-3 vertically right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        // case 4 horizontally left
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j]) {
                return false;
            }
        }
        return true;
    }

    static void nQueen2(boolean[][] board, int row, int queenPlaced, int totalQueen, String ans) {
        if (totalQueen == queenPlaced) {
        	count++;
            System.out.println(count+" "+ans);
            return;
        }
        if(row == board.length){
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
           
            nQueen2(board, row + 1, queenPlaced + 1, totalQueen,ans+"{" + row + "-" + col + "}");
             
        }
    }

    public static void main(String[] args) {
       // queenCombination2D(new boolean[2][3], 0, 0, 0, 4, "");
        //queenCombination2DKill(new boolean[3][4], 0, 0, 0, 3, "");
    	nQueen2(new boolean[4][4], 0, 0, 4, "");
    }

}
