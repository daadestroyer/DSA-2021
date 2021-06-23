/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursion_challenges;

import java.util.Scanner;

/*
String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

sample input
-------------
12

sample output
-------------
.a
.b
.c
+a
+b
+c
@a
@b
@c
$a
$b
$c

*/
public class App09_smartkeypad {

	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	static void smartKeypad(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		String code = table[Character.getNumericValue(ch)];

		for (int i = 0; i < code.length(); i++) {
			smartKeypad(ros, ans+code.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		smartKeypad(ques, "");

	}
}
