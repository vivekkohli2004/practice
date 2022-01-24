//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
package leet.string;

import java.util.HashMap;
import java.util.Iterator;

public class FirstUniqueChar {

	public static int firstUniqChar(String s) {
		int result = -1;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			//if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			//}
		}

		Iterator<Character> it = map.keySet().iterator();
		int min = Integer.MAX_VALUE;
		Character c;
		int i;
		while (it.hasNext()) {
			c = it.next();
			if (map.get(c) == 1) {
				i = s.indexOf(c);
				if (i < min) {
					min = i;
					result = i;
				}
			}
		}
		//better solution for above while loop
		
		/*
		 * for (int i = 0; i < n; i++) { if (map.get(s.charAt(i)) == 1) return i; }
		 */
		return result;
	}

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));

	}
}
