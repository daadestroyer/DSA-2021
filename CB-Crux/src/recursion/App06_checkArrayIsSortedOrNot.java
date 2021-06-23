package recursion;

public class App06_checkArrayIsSortedOrNot {

	static boolean checkSortedArray(int[] ar, int idx) {

		// basecase
		if (idx == ar.length - 1)
			return true;

		if (ar[idx] > ar[idx + 1]) {
			return false;
		} else {
			return checkSortedArray(ar, idx + 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(checkSortedArray(new int[] { 10, 20, 30, 40, 50 }, 0));
	}

}
