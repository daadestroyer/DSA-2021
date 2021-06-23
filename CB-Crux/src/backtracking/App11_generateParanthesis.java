package backtracking;

public class App11_generateParanthesis {

	static void generateParanthesis(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;

		}

		if (open > n || close > open) {
			return;
		}
		generateParanthesis(n, open + 1, close, ans + "(");

		generateParanthesis(n, open, close + 1, ans + ")");

	}

	public static void main(String[] args) {
		generateParanthesis(2, 0, 0, "");

	}
}
