package maths;

import java.util.Scanner;

public class App06_ArmstrongNo {
	
		static int order(int n) {
			String string = Integer.toString(n);
			return string.length();
		}
		static boolean armstrong(int n) {
			int order = order(n);
			int temp = n;
			int sum  = 0;
			
			while(temp != 0) {
				int rem = temp%10;
				sum = sum + (int)(Math.pow(rem, order));
				temp = temp/10;
			}
			if(sum == n) {
				return true;
			}
			return false;
		}
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();
				boolean status = true;
				if(n <= 0) {
					status = false;
				}
				else {
					// call armstrong
				}
				
				if(status) System.out.println("true");
				else System.out.println("false");
		}
}
