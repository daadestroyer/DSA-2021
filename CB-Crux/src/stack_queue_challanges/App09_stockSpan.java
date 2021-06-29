package stack_queue_challanges;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
Output Format
--------------
Display the array containing stock span values.

Sample Input
------------
5
30
35
40
38
35

Sample Output
--------------
1 2 3 1 1 END


Explanation
------------
For the given case
for day1 stock span =1
for day2 stock span =2 (as 35>30 so both days are included in it)
for day3 stock span =3 (as 40>35 so 2+1=3)
for day4 stock span =1 (as 38<40 so only that day is included)
for day5 stock span =1 (as 35<38 so only that day is included)
hence output is 1 2 3 1 1 END

5
39
45
40
42
43

1 2 1 2 3 END

8
10
20
30
40
50
60
70
80
1 2 3 4 5 6 7 8 END

5
30
35
40
38
35
1 2 3 1 1 END

5
30
40
35
45
42
1 2 1 4 1 END

*/
public class App09_stockSpan {

	static void stockSpan(int[] stocks) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] span = new int[stocks.length];
		stack.push(0);
		span[0] = 1;

		for (int i = 1; i < stocks.length; i++) {

			while (stack.size() > 0 && stocks[i] > stocks[stack.peek()]) {
				stack.pop();
			}

			if (stack.size() == 0) {
				span[i] = i + 1;
				stack.push(i);
			} else {
				span[i] = i - stack.peek();
				stack.push(i);
			}
		}

		for (int i = 0; i < span.length; i++) {
			System.out.print(span[i] + " ");
		}
		System.out.print("END");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] stocks = new int[s];

		for (int i = 0; i < stocks.length; i++) {
			stocks[i] = sc.nextInt();
		}

		stockSpan(stocks);
	}
}
