package recursion;

public class App11_coinChange {

	static void coinChange(int[] coins, int amt, String ans) {
		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			if (amt >= coins[i]) {
				coinChange(coins, amt - coins[i], ans + coins[i]);
			}
		}
	}

	public static void main(String[] args) {
		coinChange(new int[] { 1, 2, 3 }, 5, "");
	}
}
