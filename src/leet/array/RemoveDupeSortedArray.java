package leet.array;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/solution/
import java.util.Arrays;

public class RemoveDupeSortedArray {

	public static void main(String[] args) {

		// int [] a= new int [] {0,0,1,1,1,2,2,3,3,4};
		int[] a = new int[] { 0, 1, 2, 2, 3, 3, 4 };
		//int[] a = new int[] { 1, 1, 2};
		System.out.println(removeDuplicates(a));

	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i=0;
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
		}
		
		
		System.out.println(Arrays.toString(nums));
		return i+1;
	}
}
