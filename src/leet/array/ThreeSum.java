package leet.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/3sum/
//https://www.youtube.com/watch?v=qJSPYnS35SE

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		int twoSum = 0;
		List<List<Integer>> output = new ArrayList<>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i + 1;
				int high = nums.length - 1;
				twoSum = 0 - nums[i];
				while (low < high) {
					if (nums[low] + nums[high] == twoSum) {
						output.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while (low < high && nums[low] == nums[low + 1])
							low++;
						while (low < high && nums[high] == nums[high - 1])
							high--;
						low++;
						high--;
					} else if (nums[low] + nums[high] > twoSum) {
						high--;
					} else {
						low++;
					}
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {

		int[] a = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> l = threeSum(a);
		System.out.println(l);

	}
}
