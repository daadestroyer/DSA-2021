package backtracking;

public class App04_coinChangePermutation {
    static int count = 0;
    static void coinChangePermutation(int[] denom, int amount, String ans) {
        if ((amount == 0)) {
            count++;
            System.out.println(count+". "+ans);
            return;
        }
        for (int i = 0; i < denom.length; i++) {
            if (amount >= denom[i]) {
                coinChangePermutation(denom, amount - denom[i], ans + denom[i]);
            }
        }
    }

    public static void main(String[] args) {

        coinChangePermutation(new int[]{2, 3, 5, 6}, 10, "");
    }
}
