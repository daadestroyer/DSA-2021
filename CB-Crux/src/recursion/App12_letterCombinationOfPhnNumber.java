package recursion;
/*
2 3
ad , ae , af , bd
be , bf , cd , ce , cf
*/
public class App12_letterCombinationOfPhnNumber {

	static String getCode(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}

	static void letterCombination(String quest, String ans) {

		// possitive base case
		if (quest == "") {
			System.out.println(ans);
			return;
		}

		char ch = quest.charAt(0); // 2
		String ros = quest.substring(1); // 49

		String code = getCode(ch); // abc

		for (int i = 0; i < code.length(); i++) {
			letterCombination(ros, ans + code.charAt(i));
		}

	}

	public static void main(String[] args) {
		letterCombination("249", "");
	}
}
