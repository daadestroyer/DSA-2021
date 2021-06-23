package recursionGET;

import java.util.ArrayList;

public class App02_getPermutation {

	static ArrayList<String> getPermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> basecase = new ArrayList<String>();
			basecase.add("");
			return basecase;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rec_res = getPermutation(ros);
		ArrayList<String> my_res = new ArrayList<String>();

		for (String rrs : rec_res) {
			for (int i = 0; i <= rrs.length(); i++) {
				String val = rrs.substring(0,i)+ch+rrs.substring(i);
				my_res.add(val);
			}
		}
		return my_res;
	}

	public static void main(String[] args) {
		ArrayList<String> permutation = getPermutation("abc");
		System.out.println(permutation);
	}

}
