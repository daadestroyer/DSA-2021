/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursionPRINT;

public class App02_printPermutation {

	static void printPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
		}
		for (int i = 0; i < ques.length(); i++) {
			char cc = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(1 + i);
			
			printPermutation(ros, ans+cc);
		}
	}

	public static void main(String[] args) {
		printPermutation("abc", "");
	}
}
