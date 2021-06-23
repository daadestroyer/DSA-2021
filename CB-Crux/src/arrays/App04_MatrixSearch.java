package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class App04_MatrixSearch {

	static boolean searchElement(int ele, int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == ele)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rowsize = scanner.nextInt();
		int colsize = scanner.nextInt();
		int[][] arr = new int[rowsize][colsize];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int element = scanner.nextInt();
		if(searchElement(element, arr)) {
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		}
	}
}
