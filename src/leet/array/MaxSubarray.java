package leet.array;

public class MaxSubarray { // Kadane's algo

	public static void main(String[] args) {

		int a[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(findMaxSubarraySum(a));

	}

	private static int findMaxSubarraySum(int a[]) {

		int max = a[0];
		// int max= a[0];
		int currSum = a[0];
		for (int j = 1; j < a.length; j++) {

			currSum = Math.max(currSum + a[j], a[j]);

			max = Math.max(max, currSum);
		}

		return max;

	}
}
