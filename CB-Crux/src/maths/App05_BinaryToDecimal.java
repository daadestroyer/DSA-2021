package maths;

import java.util.Scanner;

/*
Sample Input
101010
Sample Output
42
*/
public class App05_BinaryToDecimal {

	static int getDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (binary != 0) {
			int temp = binary % 10;
			decimal += temp * Math.pow(2, n);
			binary = binary / 10;
			n++;
		}
		return decimal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		System.out.println(getDecimal(binary));
	}
}
