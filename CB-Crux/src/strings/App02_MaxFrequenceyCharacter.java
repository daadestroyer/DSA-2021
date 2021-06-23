package strings;

import java.util.Scanner;

/*
aaabacb
a
*/
public class App02_MaxFrequenceyCharacter {

	static char maxFreqChar(String str) {
		char[] arr = str.toCharArray();
		int[] count = new int[26];

		for (char ch : arr) {
			count[ch - 97]++;
		}
		int max = 0;
		char res = ' ';

		for (int i = 0; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				res = (char) (i + 97);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		System.out.println(maxFreqChar(str));
	}
}
