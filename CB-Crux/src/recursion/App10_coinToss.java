package recursion;

public class App10_coinToss {

	static void coinToss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		// head call
		coinToss(n - 1, ans + "H");

		// tail call
		coinToss(n - 1, ans + "T");
	}

	public static void main(String[] args) {
		coinToss(3, "");
	}
}
