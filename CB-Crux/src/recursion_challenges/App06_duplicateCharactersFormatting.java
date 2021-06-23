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
hel*lo
*/
public class App06_duplicateCharactersFormatting {

	static void duplicateCharacterFormatting(String ques, String ans) {
		if (ques.length() == 1) {
			if (ques.charAt(0) != ans.charAt(ans.length() - 1)) {
				ans += ques.charAt(0);
				System.out.println(ans);
				return;
			}

		}
		if (ques.charAt(0) != ques.charAt(1)) {
			duplicateCharacterFormatting(ques.substring(1), ans + ques.charAt(0));
		} else {
			duplicateCharacterFormatting(ques.substring(1), ans + ques.charAt(0) + '*');
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ques = scanner.next();
		duplicateCharacterFormatting(ques, "");
	}
}
