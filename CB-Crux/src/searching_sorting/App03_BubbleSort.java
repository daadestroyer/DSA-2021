package searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class App03_BubbleSort {

	static void sortArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter size");
		int size = scanner.nextInt();

		System.out.println("enter array elements");
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		sortArray(ar);
		System.out.println(Arrays.toString(ar));

	}
}
