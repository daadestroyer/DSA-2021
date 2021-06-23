package backtracking;

public class App15_codesOfString {

	static char encode1(char ch1) {
		return (char) (Character.getNumericValue(ch1) + 96);
	}

	static char encode2(String ch2) {
		int parseInt = Integer.parseInt(ch2);
		return (char) (parseInt + 96);
	}

	static void codes(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		// 1 digit call
		char ch1 = ques.charAt(0);
		String roq1 = ques.substring(1);
		codes(roq1, ans + encode1(ch1));

		// 2 digit call
		if (ques.length() >= 2) {
			String ch2 = ques.substring(0, 2);
			String roq2 = ques.substring(2);
			if (Integer.parseInt(ch2) <= 26) {
				codes(roq2, ans + encode2(ch2));
			}
		}

	}

	public static void main(String[] args) {
		codes("1125", "");
	}
}
