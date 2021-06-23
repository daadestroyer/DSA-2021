package arrays;

import java.util.Scanner;

/*
 * 
3
1 2 3
4 5 6
7 8 9

output
------
7 4 1 
8 5 2 
9 6 3
*/
public class App15_RotateImageClockWise {

	static void rotateImageClockWise(int[][] arr) {
//		swapping values
//		1 4 7
//		2 5 8
//		3 6 9
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		// transposing matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr.length - 1 - j];
				arr[i][arr.length - 1 - j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size : ");
		int size = scanner.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		rotateImageClockWise(arr);

		// print array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
