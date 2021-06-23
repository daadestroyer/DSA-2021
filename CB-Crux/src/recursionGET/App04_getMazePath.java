package recursionGET;

import java.util.ArrayList;

public class App04_getMazePath {

	public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> posbase = new ArrayList<String>();
			posbase.add("");
			return posbase;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> negbase = new ArrayList<String>();
			return negbase;
		}

		ArrayList<String> my_res = new ArrayList<String>();

		// horizontal call
		ArrayList<String> horiRes = getMazePath(cr, cc + 1, er, ec);
		for (String str : horiRes) {
			my_res.add("H" + str);
		}

		// vertical call
		ArrayList<String> verRes = getMazePath(cr + 1, cc, er, ec);
		for (String str : verRes) {
			my_res.add("V" + str);
		}

		// diagonal call
		ArrayList<String> diaRes = getMazePath(cr + 1, cc + 1, er, ec);
		for (String str : diaRes) {
			my_res.add("D" + str);
		}

		return my_res;

	}

	public static void main(String[] args) {
		ArrayList<String> mazePath = getMazePath(0, 0, 2, 2);
		System.out.println(mazePath);
	}
}
