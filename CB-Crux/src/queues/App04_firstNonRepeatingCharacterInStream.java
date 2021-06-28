package queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App04_firstNonRepeatingCharacterInStream {

	// O(N)^
	static void approach1() {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();

		char ch = sc.next().charAt(0);

		while (ch != '.') {
			sb.append(ch);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
			for (int i = 0; i < sb.length(); i++) {
				char c = sb.charAt(i);

				if (hm.get(c) == 1) {
					System.out.println(c);
					break;
				}

			}
			ch = sc.next().charAt(0);
		}
	}

	static void approach2() {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		Queue<Character> queue = new LinkedList<Character>();
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		while (ch != '.') {
			queue.add(ch);

			// maintaining each entry of character in queue
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
			// traversing queue and getting each character and check count in hashmap
			while (!queue.isEmpty()) {
				char firstChar = queue.peek();
				if (hm.get(firstChar) == 1) {
					System.out.println(firstChar);
					break;
				} else {
					queue.poll();
				}
			}

			ch = sc.next().charAt(0);
		}
	}

	public static void main(String[] args) {
		approach2();
	}
}
