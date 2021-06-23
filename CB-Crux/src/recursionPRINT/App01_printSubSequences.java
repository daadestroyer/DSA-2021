/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursionPRINT;

/*
abc
"" , c , b , bc , a , ac , ab  , abc
*/
public class App01_printSubSequences {

	public static void printSubSequences(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char cc = ques.charAt(0);
		String ros = ques.substring(1);

		printSubSequences(ros, ans);
		printSubSequences(ros, ans + cc);

	}

	public static void main(String[] args) {
		printSubSequences("abc", "");
	}
}
