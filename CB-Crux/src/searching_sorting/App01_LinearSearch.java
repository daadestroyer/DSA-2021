package searching_sorting;

import java.util.Scanner;

public class App01_LinearSearch {

	static int linearSearch(int[] ar, int ele) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == ele) {
				return i;
			}
		}
		return 0;
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
		System.out.println("enter element to be searched");
		int ele = scanner.nextInt();

		int res = linearSearch(ar, ele);
		if (res == 0) {
			System.out.println("No element found");
		} else {
			System.out.println(ele + " found at index = " + res);
		}

	}
}
