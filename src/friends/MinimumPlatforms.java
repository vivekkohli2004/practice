package friends;

import java.util.Arrays;

public class MinimumPlatforms {

	public static void main(String[] args) {
		int arr[] = new int[] { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = new int[] { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println(findPlatform(arr, dep,6));
	}

	// railway station such that no train waits.
	static int findPlatform(int arr[], int dep[], int n) {
		Arrays.sort(arr);
        Arrays.sort(dep);

		//assumes that times are sorted. Else sort them by Arrays.sort();
		int i = 1, j = 0, plat_needed = 1, result = 1;
		while (i < n && j < n) {

			if (arr[i] <= dep[j]) {
				plat_needed++;
				i++;
			} else {
				plat_needed--;
				j++;
			}
			result = Math.max(plat_needed, result);

		}
		return result;
	}

}

