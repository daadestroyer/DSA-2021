package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App02_maxCharacter {

	static void maxChar(String str) {
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (!hMap.containsKey(str.charAt(i))) {
				hMap.put(str.charAt(i), 1);
			} else {
				hMap.put(str.charAt(i), hMap.get(str.charAt(i)) + 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = hMap.entrySet();
		char maxchar = '\0';
		int max = 0;
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				maxchar = entry.getKey();
			}
		}

		System.out.println(maxchar);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		maxChar(str);

	}
}
