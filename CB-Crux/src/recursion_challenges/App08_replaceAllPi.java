/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursion_challenges;

import java.util.Scanner;

public class App08_replaceAllPi {

	static void replacePI(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			replacePI(str.substring(2), res + "3.14");
		} else {
			replacePI(str.substring(1), res + str.charAt(0));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			String str = sc.next();
			replacePI(str, "");
		}
	}
}
