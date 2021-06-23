package strings;

import java.util.Scanner;

/*
Sample Input
--------------
aaabbccds

Sample Output
-------------
a3b2c2ds

*/
public class App01_StringCompression {

	static String stringCompression(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length();) {
			int count = 0;
			char ch = s.charAt(i);
			while (i < s.length() && ch == s.charAt(i)) {
				count++;
				i++;
			}
			sb.append(ch);
			if(count>1) {
				sb.append(count);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(stringCompression(s));
	}
}
