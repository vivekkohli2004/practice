package leet.array;

import java.util.Arrays;

//Rotate to the RIGHT not LEFT!!
public class RotateArray {

	public static void rotate(int[] nums, int k) {
		//k %= nums.length;// use this or the if below.
		//System.out.println(3%5); //3
		
		if (k > nums.length)
			k -= nums.length;
		reverse(nums, 0, nums.length - 1);
		//System.out.println(Arrays.toString(nums));
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		rotate(nums, 2);
		System.out.println(Arrays.toString(nums));
	}
}

/*
 * 1234567 5671234
 * 
 * 1234 3412
 */

/*
 * 1234567 7654321
 */