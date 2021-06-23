package recursion;

public class App07_returnFirstIndexAndLastIndex {

	static int firstIndex(int[] ar, int idx, int ele) {
		if (idx == ar.length - 1) {
			return -1;
		}
		if (ar[idx] == ele) {
			return idx;
		} else {
			return firstIndex(ar, idx + 1, ele);
		}
	}

	static int lastIndex(int[] ar, int idx, int ele) {
		if (idx == ar.length - 1) {
			return -1;
		}
		int index = lastIndex(ar, idx + 1, ele);
		if (index == -1) {
			if (ar[idx] == ele) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return index;
		}
	}

	public static void main(String[] args) {
		// System.out.println(firstIndex(new int[] { 1, 22, 32, 4, 34, 22, 43, 34, 4 },
		// 0, 4));
		System.out.println(lastIndex(new int[] { 1, 22, 32, 4, 34, 22, 43, 34, 4 }, 0, 220));
	}
}
