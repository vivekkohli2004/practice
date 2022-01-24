package leet.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
public class ArrayIntersection {

	/*
	 * public static int[] intersect(int[] nums1, int[] nums2) { List<Integer>
	 * output = new ArrayList<>(); LinkedList<Integer> ll = new LinkedList<>();
	 * 
	 * for (int i : nums1) { ll.add(i); }
	 * 
	 * int next; boolean proceed; Iterator<Integer> it;
	 * 
	 * for (int i : nums2) { proceed = true; it = ll.iterator(); while (it.hasNext()
	 * && proceed) { next = it.next(); if (ll.contains(i)) { output.add(i);
	 * ll.remove(Integer.valueOf(i)); ///*** We cant use iterator.remove()- it
	 * removed the unintended element.*** proceed = false; } } } return
	 * output.stream().mapToInt(i -> i).toArray(); }
	 */

	public static void main(String[] args) {
		/*
		 * int[] nums1 = new int[] { 4, 9, 5 }; int[] nums2 = new int[] { 9, 4, 9, 8, 4
		 * };
		 */
		
		int[] nums1 = new int[] { 1,2,2,1 };
		int[] nums2 = new int[] { 2,2 };
		int x[] = intersect(nums1, nums2);
		System.out.println(Arrays.toString(x));
	}

//easier approach:

public static int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> n2List= new ArrayList<>();
      for (int i : nums2) {
			n2List.add(i);
		}
      
      List<Integer> output= new ArrayList<>();
      
      for(int i:nums1){	
          if(!n2List.isEmpty() && n2List.contains(i)){
              output.add(i);
              n2List.remove(Integer.valueOf(i));
          }
      }
      return  output.stream().mapToInt(i -> i).toArray(); //return  output.stream().mapToInt(Integer::intValue).toArray();
      
}
}