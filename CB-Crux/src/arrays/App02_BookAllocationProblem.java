package arrays;

import java.util.Scanner;

public class App02_BookAllocationProblem {
	
	static boolean isIsPossible(int[] noOfPagesInEachBook, int noOfStudents, int mid) {
		
		int student = 1;
		int pagesRead = 0;
		
		for (int i = 0; i < noOfPagesInEachBook.length; ) {
			if(pagesRead+noOfPagesInEachBook[i]<=mid) {
				pagesRead+=noOfPagesInEachBook[i];
				i++;
			}
			else {
				student++;
				pagesRead = 0;
				if(student>noOfStudents)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfBooks = scanner.nextInt();
		int noOfStudents = scanner.nextInt();
		int ans = 0;
		int minPages = 0;
		int maxPages = 0;
		int[] noOfPagesInEachBook = new int[noOfBooks];
		for (int i = 0; i < noOfPagesInEachBook.length; i++) {
			noOfPagesInEachBook[i] = scanner.nextInt();
			maxPages += noOfPagesInEachBook[i];
		}

		while (minPages <= maxPages) {
			int mid = (minPages + maxPages) / 2;

			if (isIsPossible(noOfPagesInEachBook, noOfStudents, mid)) {
				maxPages = mid - 1;
				ans = mid;
			} else {
				minPages = mid + 1;
			}
		}
		System.out.println(ans);
	}
}
