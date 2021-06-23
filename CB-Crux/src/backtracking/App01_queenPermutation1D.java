/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package backtracking;


public class App01_queenPermutation1D {

    static void queenPermutation1D(boolean[] boxes, int queenPlaced, int totalQueen, String ans) {
        if (queenPlaced == totalQueen) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == false) {
                boxes[i] = true;
                queenPermutation1D(boxes, queenPlaced + 1, totalQueen, ans + "Q" + queenPlaced + "B" + i + " ");
                boxes[i] = false;
            }
        }
    }


    public static void main(String[] args) {
        queenPermutation1D(new boolean[4], 0, 2, "");
    }
}


