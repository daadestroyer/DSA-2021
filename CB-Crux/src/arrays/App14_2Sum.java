package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
4
1 0 2 9
5
3 4 5 6 7
*/
public class App14_2Sum {

	static void twoSum(int[] ar , int tar) {
		int low = 0;
		int high = ar.length-1;
		while (low<high) {
			if(ar[low]+ar[high] == tar) {
				System.out.print(ar[low]+" and "+ar[high]);
				low++;
				System.out.println();
			}
			else if(ar[low]+ar[high]>tar) {
				high--;
			}
			else {
				low++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size");
		int size = scanner.nextInt();
		int[] ar = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		System.out.println("enter target");
		int tar = scanner.nextInt();
		Arrays.sort(ar);
		twoSum(ar, tar);
	}
}
