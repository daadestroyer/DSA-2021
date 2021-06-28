package stack_queue_challanges;

import java.util.Scanner;
import java.util.Stack;

/*
Sample Input
------------
7
2 73
2 83
2 43
1
1
2 16
2 48

Sample Output
-------------
43
83

*/
public class App04_prateekSirAndCoding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			
			if(q == 2) {
				stack.push(sc.nextInt());
			}
			else {
				if(stack.isEmpty()){
					System.out.println("No Code");
				}
				else {
					System.out.println(stack.pop());
				}
			}
		}
	}
}
