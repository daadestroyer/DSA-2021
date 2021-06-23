/*
Author : Shubham Nigam aka daadestroyer_14
Contact: shubhamn.mca20@rvce.edu.in
*/
package recursion_challenges;

import java.util.Arrays;
import java.util.Scanner;

/*

Sample Input
------------
5
3
2
1
2
3
2

Sample Output
-------------
1 3

*/
public class App01_allIndices {

	static int[] getAllIndices(int[] a, int low, int data, int idx) {
		if (low == a.length) {
			int[] basecase = new int[idx];
			return basecase;
		}
		int[] res = null;
		if (a[low] == data) {
			res = getAllIndices(a, low + 1, data, idx + 1);
			res[idx] = low;

		} else {
			res = getAllIndices(a, low + 1, data, idx);
		}
		 
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int[] allIndices = getAllIndices(a, 0, data, 0);
		System.out.println(Arrays.toString(allIndices));
	}
}
