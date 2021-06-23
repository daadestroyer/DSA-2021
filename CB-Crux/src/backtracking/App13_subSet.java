package backtracking;

import java.util.Scanner;

public class App13_subSet {

	static void subset(int[] ar, int vidx, String ans) {
		if (vidx == ar.length) {
			System.out.println(ans);
			return;
		}
		// include
		subset(ar, vidx + 1, ans + ar[vidx]);

		// exclude
		subset(ar, vidx + 1, ans);

	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		subset(new int[] { 1, 2, 3 }, 0, "");
	}

}
