package backtracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
4
1
2
3
4
5
*/
public class App12_sumItUp {

	static HashMap<String, Integer> hm = new HashMap<String, Integer>();

	static void sumItUp(int[] ar, int idx, int T, String ans) {
		// possitive base case
		if (T == 0) {
			if (!hm.containsKey(ans)) {
				hm.put(ans, 1);
				System.out.println(ans);
			}
		}

		// negative base case
		if (idx == ar.length) {
			return;
		}

		// take
		if (T > 0)
			sumItUp(ar, idx + 1, T - ar[idx], ans + ar[idx] + " ");
		// not take
		sumItUp(ar, idx + 1, T, ans);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		int T = scanner.nextInt();
		Arrays.sort(ar);
		sumItUp(ar, 0, T, "");

	}
}
