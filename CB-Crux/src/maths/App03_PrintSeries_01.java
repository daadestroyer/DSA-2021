package maths;

import java.util.Scanner;

/*
10 = n1
4 = n2
5 
11 
14 
17 
23 
26 
29 
35 
38 
41

Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.


*/
public class App03_PrintSeries_01 {

	static void printSeries(int n1, int n2) {
		int n = 1;
		int count = 1;
		int sum = 0;
		while (count <= n1) {
			sum = 3 * n + 2;
			if (sum % n2 != 0) {
				System.out.println(sum);
				count++;
				sum=0;
			}
			n++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		printSeries(n1, n2);
	}
}
