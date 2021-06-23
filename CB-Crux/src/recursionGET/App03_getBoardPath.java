package recursionGET;

import java.util.ArrayList;

public class App03_getBoardPath {

	public static ArrayList<String> getBoardPath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> pbc = new ArrayList<String>();
			pbc.add("");
			return pbc;
		}
		if (curr > end) {
			ArrayList<String> nbc = new ArrayList<String>();
			return nbc;
		}
		ArrayList<String> my_res = new ArrayList<String>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rec_rec = getBoardPath(curr + dice, end);
			for (String str : rec_rec) {
				my_res.add(str + dice);
			}
		}
		return my_res;
	}

	public static void main(String[] args) {
		ArrayList<String> boardPath = getBoardPath(0, 10);
		System.out.println(boardPath);
		System.out.println(boardPath.size());
	}
}
