package searching_sorting;

import java.util.Scanner;

public class App02_BinarySearchRecursive {

	static int recursiveBinarySearch(int[] ar, int low, int high, int ele) {

		if (low <= high) {
			int mid = (low + high) / 2;

			if (ar[mid] == ele) {
				return mid;
			} else if (ar[mid] > ele) {
				return recursiveBinarySearch(ar, low, mid - 1, ele);
			} 
			return recursiveBinarySearch(ar, mid + 1, high, ele);
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
		int res = recursiveBinarySearch(ar, 0,ar.length-1,ele);
//		System.out.println("res = "+res);
		if (res == 0) {
			System.out.println("no element found");
		} else {
			System.out.println(ele + " found at index " + res);
		}
		
	}
}
