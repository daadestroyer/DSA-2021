package arrays;

import java.util.Scanner;

public class App05_PaintersPartition {

	static boolean isItPossible(int[] boards, int noOfPainter, int mid) {
		int painters = 0;
		int boardsPainted = 0;

		for (int i = 0; i < boards.length;) {
			if (boardsPainted + boards[i] <= mid) {
				boardsPainted += boards[i];
				i++;
			} else {
				painters++;
				boardsPainted = 0;
				if (painters > noOfPainter) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfPainter = scanner.nextInt();
		int noOfBoards = scanner.nextInt();
		int lo = 0, hi = 0, ans = 0;

		int[] boards = new int[noOfBoards];
		for (int i = 0; i < boards.length; i++) {
			boards[i] = scanner.nextInt();
			hi += boards[i];
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(boards, noOfPainter, mid)) {
				hi = mid - 1;
				ans = mid;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(ans);

	}
}
