package arrays;

import java.util.Scanner;

public class App01_KadanesAlgorithm {

	static int kadanesAlgo(int[] ar) {
		int curr_sum = ar[0];
		int overall_sum = ar[0];

		for (int i = 1; i < ar.length; i++) {
			if (curr_sum >= 0) {
				curr_sum += ar[i];
			} else {
				curr_sum = ar[i];
			}
			if (curr_sum > overall_sum) {
				overall_sum = curr_sum;
			}
		}
		return overall_sum;
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
		int maxSum = kadanesAlgo(ar);
		System.out.println(maxSum);

	}
}
