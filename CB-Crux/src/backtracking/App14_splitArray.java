package backtracking;

public class App14_splitArray {

	static void splitArray(int[] ar, int vidx, String grp1, int sumg1, String grp2, int sumg2) {
		if (vidx == ar.length) {
			if (sumg1 == sumg2) {
				System.out.println(grp1 + "and " + grp2);
			}
			return;
		}

		// include for grp1
		splitArray(ar, vidx + 1, grp1 + ar[vidx] + " ", sumg1 + ar[vidx], grp2, sumg2);

		// include for grp2
		splitArray(ar, vidx + 1, grp1, sumg1, grp2 + ar[vidx]+" ", sumg2 + ar[vidx]);
	}

	public static void main(String[] args) {
		int[] ar = new int[] { 1, 2, 3, 3, 4, 5 };
		int vidx = 0;
		String grp1 = "";
		int sumg1 = 0;
		String grp2 = "";
		int sumg2 = 0;

		splitArray(ar, vidx, grp1, sumg1, grp2, sumg2);
	}
}
