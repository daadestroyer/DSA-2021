/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursionPRINT;

public class App04_countBoardPath {

	static int countBoardPath(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count+=countBoardPath(curr+dice, end);
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countBoardPath(0,10));
	}
}
