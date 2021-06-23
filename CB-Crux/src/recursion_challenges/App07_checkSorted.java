/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursion_challenges;

import java.util.Scanner;

public class App07_checkSorted {
	static int checkSortedOrNot(int[] a, int idx) {
		if (idx == a.length - 1 || idx == a.length) {
			return 1;
		}
		if (a[idx] > a[idx + 1]) {
			return 0;
		}
		return checkSortedOrNot(a, idx + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		if (checkSortedOrNot(a, 0) == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
