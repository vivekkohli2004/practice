package leet.array;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int a[] = new int[] { 5, 7, 7, 8, 8, 10 };

		int first = findPostion(8, a, true);

		int last = findPostion(8, a, false);
		System.out.println("FIRST:" +first + "SECOND:" +last);
	}

	private static int findPostion(int target, int[] a, boolean firstOccurence) {
		int start = 0;
		int end = a.length - 1;
		int mid;
		int location = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (a[mid] < target) {
				start = mid + 1;
			} else if (a[mid] > target) {
				end = mid - 1;
			} else {
				if (firstOccurence) {
					location = mid;
					end = mid - 1;
				}else {
					location = mid;
					start = mid + 1;
				}
			}
		}
		return location;
	}

}
