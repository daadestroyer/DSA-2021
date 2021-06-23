package searching_sorting;

import java.util.Scanner;

public class App02_BinarySearch {

	static int binarySearch(int[] ar, int ele) {

		int low = 0;
		int high = ar.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar[mid] == ele) {
				return mid;
			} else if (ar[mid] > ele) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array size");
		int size = scanner.nextInt();
		int[] ar = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		System.out.println("enter element to be search");
		int ele = scanner.nextInt();
		int res = binarySearch(ar, ele);
		if (res == 0) {
			System.out.println("no element found");
		} else {
			System.out.println(ele + " found at index " + res);
		}
	}
}
