import java.util.Scanner;

/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/

public class App04_convertStringToInteger {
	static void convert(String ques, int ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		System.out.println(ans);
		convert(ques.substring(1), ans * 10 + Character.getNumericValue(ques.charAt(0)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		convert(ques, 0);

	}
}
