/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursionPRINT;

public class App05_printMazePath {

	static void printMazePath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec)
			return;

		// horizontal call
		printMazePath(cr, cc + 1, er, ec, ans + "H");

		// vertical call
		printMazePath(cr + 1, cc, er, ec, ans + "V");

		// diagonal call
		printMazePath(cr + 1, cc + 1, er, ec, ans + "D");
	}

	public static void main(String[] args) {
		printMazePath(0, 0, 2, 2, "");
	}
}
