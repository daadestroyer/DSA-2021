package maths;

import java.util.Scanner;

// check whether number is prime or not

public class App01_PrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		
		for (int i = 2; i < n - 1; i++) {
			if (n % 2 == 0) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("not prime");
		else
			System.out.println("prime");
	}
}
