package recursion;

/*
0 1 2 3 5 8 13
*/
public class App05_NthFibonacci {

	static int fib(int n) {
		if (n == 1 || n == 0)
			return n;
		
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(fib(5));
	}
}
