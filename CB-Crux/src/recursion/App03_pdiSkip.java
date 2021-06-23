package recursion;

public class App03_pdiSkip {

	static void pdiSkip(int n) {

		// base condition
		if (n == 0) {
			return;
		}
		// work when stack is building
		if (n % 2 != 0) {
			System.out.println(n);
		}
		pdiSkip(n - 1);

		// work when stack is unbuilding
		if (n % 2 == 0) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		pdiSkip(5);
	}
}
