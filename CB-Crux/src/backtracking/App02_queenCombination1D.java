package backtracking;

public class App02_queenCombination1D {

    static void queenCombination1D(boolean[] boxes, int queenPlaced, int totalQueen, String ans, int lastBoxUsed) {

        if (queenPlaced == totalQueen) {
            System.out.println(ans);
            return;
        }
        for (int i = lastBoxUsed +1; i < boxes.length; i++) {
            queenCombination1D(boxes, queenPlaced + 1, totalQueen, ans + "Q" + queenPlaced + "B" + i+" ", i);
        }
    }

    public static void main(String[] args) {
        queenCombination1D(new boolean[4], 0, 2, "", -1);
    }
}

