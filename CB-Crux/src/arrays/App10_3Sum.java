package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App10_3Sum {

	static void findTriplets(int[] arr, int tar) {
		for (int low = 0; low < arr.length; low++) {
			int mid = low + 1;
			int high = arr.length - 1;

			while (mid < high) {
				if (arr[low] + arr[mid] + arr[high] == tar) {
					System.out.print(arr[low] + ", " + arr[mid] + " and " + arr[high]);
					mid++;
					high--;
					System.out.println();
				} else if (arr[low] + arr[mid] + arr[high] < tar) {
					mid++;
				} else {
					high--;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int tar = scanner.nextInt();
		Arrays.sort(arr);
		findTriplets(arr, tar);
	}
}
