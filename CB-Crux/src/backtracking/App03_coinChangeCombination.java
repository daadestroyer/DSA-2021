package backtracking;

public class App03_coinChangeCombination {

    static void coinChangeCombination(int[] denom, int amount, String ans, int lastIndex) {
        if ((amount == 0)) {
            System.out.println(ans);
            return;
        }
        for (int i = lastIndex; i < denom.length; i++) {
            if (amount >= denom[i]) {
                coinChangeCombination(denom, amount - denom[i], ans + denom[i], i);
            }
        }
    }

    public static void main(String[] args) {

        coinChangeCombination(new int[]{2, 3, 5, 6}, 10, "", 0);
    }
}
