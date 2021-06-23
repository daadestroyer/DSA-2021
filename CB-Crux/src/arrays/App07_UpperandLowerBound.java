package arrays;

import java.util.Scanner;

public class App07_UpperandLowerBound {
	static int findLowerBound(int[] ar, int no) {
		int low = 0;
		int high = ar.length - 1;
		int idx = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar[mid] == no) {
				idx = mid;
				high = mid - 1;
			} else if (ar[mid] > no) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return idx;
	}

	static int findUpperBound(int[] ar, int no) {
		int low = 0;
		int high = ar.length - 1;
		int idx = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar[mid] == no) {
				idx = mid;
				low = mid + 1;
			} else if (ar[mid] > no) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		int T = scanner.nextInt();
		while (T-- > 0) {
			int no = scanner.nextInt();
			int lowerBound = findLowerBound(ar, no);
			int upperBound = findUpperBound(ar, no);
			System.out.println(lowerBound + " " + upperBound);
		}
	}
}
