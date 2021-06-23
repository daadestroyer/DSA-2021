package arrays;

import java.util.Scanner;

/*
 
Sample Input
------------
4
1 0 2 9
5
3 4 5 6 7

Sample Output
-------------
3, 5, 5, 9, 6, END

Explanation
-----------
Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and the first digit represents carry over , if any (0 here ) .
*/
public class App11_SumOfTwoArrays {

	static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] sum) {
		int carry = 0;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = sum.length - 1;

		while (k >= 0) {
			int digit = carry;
			if (i >= 0) {
				digit += arr1[1];
			}
			if (j >= 0) {
				digit += arr2[j];
			}
			carry = digit / 10; // by this we're getting carry means if we divide 16 by 10 then 1 will be carry
			digit = digit % 10; // by this we're getting remainder digit if we divide 16 by 10 then 6 will be
								// digit
			sum[k] = digit;
			i--;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size1 = scanner.nextInt();
		int[] arr1 = new int[size1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}

		int size2 = scanner.nextInt();
		int[] arr2 = new int[size2];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = scanner.nextInt();
		}

		int[] sum = new int[size1 > size2 ? size1 : size2];
		sumOfTwoArrays(arr1, arr2, sum);
	}
}
