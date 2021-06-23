/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursion_challenges;

import java.util.ArrayList;
import java.util.Collections;

/*
Sample Input
------------
cab

Sample Output
-------------
abc
acb
bac
bca
*/
public class App02_dictionaryOrder {

	static ArrayList<String> getDictOrder(String s) {
		if (s.length() == 0) {
			ArrayList<String> basecase = new ArrayList<String>();
			basecase.add("");
			return basecase;
		}
		char cc = s.charAt(0);
		String ros = s.substring(1);

		ArrayList<String> myres = new ArrayList<String>();
		ArrayList<String> dictOrder = getDictOrder(ros);

		for (String string : dictOrder) {
			for (int i = 0; i <= string.length(); i++) {
				String ans = string.substring(0, i) + cc + string.substring(i);
				myres.add(ans);
			}
		}
		Collections.sort(myres);
		return myres;
	}

	public static void main(String[] args) {
		String ques = "cab";
		ArrayList<String> dictOrder = getDictOrder(ques);
		for (String string : dictOrder) {
			if (string.compareTo(ques) < 0) {
				System.out.println(string);
			}
		}
	}
}
