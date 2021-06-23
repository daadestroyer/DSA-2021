/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursion_challenges;

import java.util.Scanner;

/*
input : 
-------
axbxc

output:
-------
abcxx

*/
public class App04_moveAllXAtEnd {

	static void moveAllXAtEnd(String ques, String ans, int count) {
		if (ques.length() == 0) {
			for (int i = 0; i < count; i++) {
				ans += 'x';
			}
			System.out.println(ans);
			return;
		}
		char cc = ques.charAt(0);
		String ros = ques.substring(1);
		if (cc != 'x') {
			ans += cc;
			moveAllXAtEnd(ros, ans, count);
		} else {
			moveAllXAtEnd(ros, ans, count + 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String ques = scanner.next();
		moveAllXAtEnd(ques, "", 0);
	}
}
