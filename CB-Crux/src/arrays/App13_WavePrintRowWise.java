package arrays;

import java.util.Iterator;
import java.util.Scanner;

/*
Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
*/
public class App13_WavePrintRowWise {

	static void wavePrintRowWise(int[][] ar) {
		for (int row = 0; row < ar.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < ar.length; col++) {
					System.out.print(ar[row][col] + " ");
				}
			} else {
				for (int col = ar.length - 1; col >= 0; col--) {
					System.out.print(ar[row][col] + " ");

				}
			}
		}
		System.out.print("END");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[][] arr = new int[N][M];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		wavePrintRowWise(arr);
	}

}
