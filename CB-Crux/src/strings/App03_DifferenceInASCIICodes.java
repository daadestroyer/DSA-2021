package strings;

import java.util.Scanner;

/*
acb
a2c-1b
*/
public class App03_DifferenceInASCIICodes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char[] ch = str.toCharArray();
		int j=1;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ch.length-1; i++) {
			sb.append(ch[i]);
			int diff = (int)(ch[j]-ch[i]);
			sb.append(diff);
			j++;
		}
		sb.append(ch[ch.length-1]);
		System.out.println(sb.toString());
	}
}
