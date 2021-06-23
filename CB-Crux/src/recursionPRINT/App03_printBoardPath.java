/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursionPRINT;

public class App03_printBoardPath {

	static void printBoardPath(int curr, int end, String ans) {
		if (curr > end) {
			System.out.println(ans);
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			printBoardPath(curr + dice, end, ans + dice);
		}
	}

	public static void main(String[] args) {
		printBoardPath(0, 10, "");
	}
}
