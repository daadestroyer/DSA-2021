/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursion_challenges;

import java.util.Scanner;

/*
input:
------
hello

output:
-------
helo
*/
public class App05_removeDuplicateCharacters {

	static void removeDuplicateCharacter(String ques, String ans) {
		if (ques.length() == 1) {
			if (ques.charAt(0) != ans.charAt(ans.length() - 1)) {
				ans += ques.charAt(0);
			}
			System.out.println(ans);
			return;
		}

		if (ques.charAt(0) != ques.charAt(1)) {
			removeDuplicateCharacter(ques.substring(1), ans + ques.charAt(0));
		} else {
			removeDuplicateCharacter(ques.substring(1), ans);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ques = scanner.next();
		removeDuplicateCharacter(ques, "");
	}
}
