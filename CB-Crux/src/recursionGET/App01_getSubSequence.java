package recursionGET;

import java.util.ArrayList;
/*
abc
"" , c , b , bc , a , ac , ab  , abc
*/
public class App01_getSubSequence {
	public static ArrayList<String> getSubSequence(String str) {
		if (str.length() == 0) {
			ArrayList<String> basecase = new ArrayList<String>();
			basecase.add("");
			return basecase;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rec_res = getSubSequence(ros);
		ArrayList<String> my_res = new ArrayList<String>();

		for (String rs : rec_res) {
			my_res.add(rs);
			my_res.add(cc + rs);
		}
		return my_res;
	}

	public static void main(String[] args) {
		ArrayList<String> subSequence = getSubSequence("abc");
		System.out.println(subSequence);
	}
}
