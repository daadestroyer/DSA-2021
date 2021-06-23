package maths;

import java.util.Scanner;

/*
n = 5
0,1,1,2,3

n = 8
0,1,1,2,3,5,8,13

*/
public class App02_FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1;

		System.out.print(a + " " + b);

		for (int i = 2; i < n; i++) {
			int sum = a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
	}
}
