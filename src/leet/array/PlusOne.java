package leet.array;

import java.util.Arrays;
//https://leetcode.com/problems/plus-one/
public class PlusOne {

	public static int[] plusOne(int[] digits) {
		boolean proceed = true;
		// int i=digits.length-1;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
				return digits;
			} else {
				digits[i] = 0;
			}
		}

		int[] output = new int[digits.length + 1];
		output[0] = 1;
		return output;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1,0, 9 };
		int[] nums1 = new int[] { 9, 9 };
		nums = plusOne(nums1);
		System.out.println(Arrays.toString(nums));
	}
}

