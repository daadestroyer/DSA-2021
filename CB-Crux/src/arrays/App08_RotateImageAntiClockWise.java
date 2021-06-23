package arrays;
import java.util.Scanner;

/*
4
1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16

1  5  9  13
2  6  7  14
3  10 11 15
4  8  12 16

output
------
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9  13
*/

public class App08_RotateImageAntiClockWise {

	public static void rotate(int[][] matrix) {

//		swapping values
//		1 5 9 13 
//		2 6 10 14 
//		3 7 11 15 
//		4 8 12 16 

		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {

				int temp = matrix[j][i];
				matrix[j][i] = matrix[matrix.length - j - 1][i];
				matrix[matrix.length - j - 1][i] = temp;
			}
		}

	}

	public static void display(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int matrix[][] = new int[size][size];
		int N = matrix.length;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = sc.nextInt();
			}
		}
		rotate(matrix);
		display(matrix);

	}
}
