package searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class App04_SelectionSort {

	static void selectionSort(int[] ar) {
		for (int counter = 0; counter < ar.length; counter++) {
			int min = counter;
			for (int j = counter + 1; j < ar.length; j++) {
				if(ar[min]>ar[j]) {
					min = j;
				}
				
			}
			int temp = ar[min];
			ar[min] = ar[counter];
			ar[counter] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size");
		int size = scanner.nextInt();
		
		System.out.println("enter array elements");
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		selectionSort(ar);
		System.out.println(Arrays.toString(ar));
	}
}
