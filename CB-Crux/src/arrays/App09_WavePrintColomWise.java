package arrays;

import java.util.Scanner;

/*
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44

11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END

*/
public class App09_WavePrintColomWise {

	static void printWaveColomWise(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[col][row]+" ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
		System.out.print("END");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[][] arr = new int[size][size];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		printWaveColomWise(arr);
	}
}
