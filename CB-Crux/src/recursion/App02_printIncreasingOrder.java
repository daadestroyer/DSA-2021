package recursion;

public class App02_printIncreasingOrder {

	static void printIncreasing(int n) {
		if (n == 0) {
			return;
		}
		printIncreasing(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		printIncreasing(5);
	}
}
