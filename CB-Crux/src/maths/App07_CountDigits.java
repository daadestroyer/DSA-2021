package maths;

import java.util.Scanner;

public class App07_CountDigits {
	
	static int countDigits(int num,int repeat) {
		int count = 0;
		
		while(num !=0 ) {
			int rem = num%10;
			if(rem == repeat)count++;
			num = num/10;
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int repeat = sc.nextInt();
		
		int res = countDigits(num,repeat);
		System.out.println(res);
	}
}
