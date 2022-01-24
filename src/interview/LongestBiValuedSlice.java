package interview;

import java.util.HashSet;

//Deutsche

public class LongestBiValuedSlice {

	public static void main(String[] args) {
		//int a[] = new int[] { 4, 2, 2, 4, 2 };
		 //int a[] = new int[] { 1, 2, 3, 2}; //expected 3
		// int a[] = new int[] {0, 5, 4, 4, 5, 12}; //expected 4
		// int a[] = new int[] {1, 2, 3, 2, 3}; //expected 4
		 int a[] = new int[] {2, 2}; //expected 2
		int result = -1;
		HashSet<Integer> hs = new HashSet<>(); // 1 2 3 2 3
		int lptr = 0, rptr = 0;
		int curLength = 1;
		hs.add(a[lptr]);
		for (rptr = 1; rptr < a.length; rptr++) {
			// hs.add(a[rptr]);
			if (!hs.contains(a[rptr]) && hs.size() <= 2) {
				if (hs.size() == 2) {
					curLength -= 1;
					hs.remove(lptr++);
				} // else {
				curLength++;
				// }
				hs.add(a[rptr]);
				// curLength++;
			} else if (hs.contains(a[rptr])) {
				curLength++;
			}
			result = Math.max(result, curLength);
		}

		System.out.println(result);
	}
}
