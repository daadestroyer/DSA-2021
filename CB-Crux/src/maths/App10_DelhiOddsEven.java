package maths;

import java.util.Scanner;

public class App10_DelhiOddsEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int even = 0 ;
		int odd = 0;
		int rem = 0;
		while(T!=0) {
			int num = sc.nextInt();
			even = 0;
			odd = 0;
			rem = 0;
			while(num != 0) {
				rem = num%10;
				if (rem % 2 ==0 ) {
					even+=rem;
				}
				else {
					odd+=rem;
				}
				num = num / 10;
			}
			if(even % 4 == 0 || odd % 3 == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}
}
