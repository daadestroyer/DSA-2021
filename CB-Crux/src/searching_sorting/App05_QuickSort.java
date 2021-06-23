package searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class App05_QuickSort {

	static void quickSort(int[]a , int lo , int hi){
		if(lo>=hi){
			return;
		}
		int low = lo;
		int high = hi;
		int mid = (lo+hi)/2;
		int pivot = a[mid];

		while(low <= high){
			
			while(a[low]<pivot)
			low++;

			while(a[high]>pivot)
			high--;

			if(low<=high){
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;

			}
		}
		quickSort(a,lo,high);
		quickSort(a,low,hi);
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
		quickSort(ar, 0, ar.length - 1);
		System.out.println(Arrays.toString(ar));
	}
}
