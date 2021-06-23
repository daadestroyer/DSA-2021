package maths;

import java.util.Scanner;

/*
0 < N < 1000 Each number in sequence S is > 0 and < 1000000000
Print boolean output - "true" or "false" defining whether the sequence is increasing - decreasing or not.
5 
1 
2 
3 
4 
5

true o/p

*/

public class App04_IncreasingDecreasingSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		boolean status = false;

		int i;
		for (i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				status = true;
			} else {
				break;
			}
		}
		i++;
		for (; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				status = true;
			} else {
				status = false;
			}
		}
		System.out.println(status);
	}
}
