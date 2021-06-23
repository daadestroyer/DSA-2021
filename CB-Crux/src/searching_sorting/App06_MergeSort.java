package searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class App06_MergeSort {

	static int[] mergeToArray(int[] fh, int[] sh) {
		int[] merge = new int[fh.length + sh.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < fh.length && j < sh.length) {
			if (fh[i] < sh[j]) {
				merge[k] = fh[i];
				k++;
				i++;
			} else {
				merge[k] = sh[j];
				k++;
				j++;
			}
		}
		// problem occur
		if (i == fh.length) {
			while (j < sh.length) {
				merge[k] = sh[j];
				k++;
				j++;
			}
		}
		if (j == sh.length) {
			while (i < fh.length) {
				merge[k] = fh[i];
				k++;
				i++;
			}
		}
		return merge;
	}

	static int[] mergeSort(int[] ar, int lo, int hi) {
		if (lo == hi) {
			int[] basecase = new int[1];
			basecase[0] = ar[lo];
			return basecase;
		}

		int mid = (lo + hi) / 2;

		int[] fh = mergeSort(ar, lo, mid);
		int[] sh = mergeSort(ar, mid + 1, hi);
		int[] merge = mergeToArray(fh, sh);
		return merge;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter size");
		int size = scanner.nextInt();

		int[] ar = new int[size];

		System.out.println("enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		int[]res = mergeSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(res));

	}
}
