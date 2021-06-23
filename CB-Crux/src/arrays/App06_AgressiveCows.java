package arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
5 3
1 2 8 4 9

== 3
*/
public class App06_AgressiveCows {

	static boolean isItPossible(int[] stalls, int noOfCows, int mid) {
		int cowPlaced = 1;
		int cowsCurrPos = stalls[0];

		for (int i = 1; i < stalls.length; i++) {
			if (stalls[i] - cowsCurrPos >= mid) {
				cowPlaced++;
				cowsCurrPos = stalls[i];
				if (cowPlaced == noOfCows) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfStalls = scanner.nextInt();
		int noOfCows = scanner.nextInt();

		int minDistBWCows = 0;
		int maxDistBWCows = 0;
		int finalDist = 0;

		int[] stalls = new int[noOfStalls];

		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = scanner.nextInt();
			
		}
		Arrays.sort(stalls);
		maxDistBWCows = stalls[stalls.length-1]-stalls[0];
		
		while (minDistBWCows <= maxDistBWCows) {
			int mid = (minDistBWCows + maxDistBWCows) / 2;

			if (isItPossible(stalls, noOfCows, mid)) {
				finalDist = mid;
				minDistBWCows = mid + 1;
				
			} else {
				maxDistBWCows = 	mid - 1;
			}
		}
		System.out.println(finalDist);

	}
}
