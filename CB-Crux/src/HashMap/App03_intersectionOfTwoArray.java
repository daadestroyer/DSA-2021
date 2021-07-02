package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class App03_intersectionOfTwoArray {
	public static void main(String[] args) {
		int[] ar1 = { 5, 1, 3, 4, 7 };
		int[] ar2 = { 2, 4, 3, 5, 7, 10, 15 };

		HashMap<Integer, Boolean> hMap = new HashMap<Integer, Boolean>();
		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i < ar2.length; i++) {
			hMap.put(ar2[i], true);
		}

		for (int i = 0; i < ar1.length; i++) {
			if(hMap.containsKey(ar1[i])) {
				aList.add(ar1[i]); 
			}
		}
		
		System.out.println(aList);

	}
}
