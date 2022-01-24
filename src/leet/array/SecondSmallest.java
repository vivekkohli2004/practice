package leet.array;

import java.util.PriorityQueue;

public class SecondSmallest {

	public static void main(String[] args) {

		int a[] = new int[] { 3, 2, 8, 9, 22, 55 };
		int k = 2;
		
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		
		while(k>1) {
			
			pq.remove();k--;
		}
		
		System.out.println(pq.peek());
		/*
		 * String [][] e= new String [][] {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"},
		 * {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
		 * System.out.println(e.length);
		 */
}
}

/**
 * 
 * Kth largest: https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/1506823/Java-Maxheap
 * 
 * 		PriorityQueue q = new PriorityQueue<>(Collections.reverseOrder()); ///IMPORTANT
		for (int i = 0; i < a.length; i++) {
			q.add(a[i]);
		}
		while (k > 1) {
			q.remove(q.peek());
			k--;
		}
		System.out.println(q.peek());
 * 
 * **/
