package leet.string;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		String common = strs[0];
		if (strs.length == 0) {
			return "";
		}

		if (strs.length == 1) {
			return strs[0];
		}

		StringBuilder sb;

		for (int i = 0; i < strs.length-1; i++) {
			 sb= new StringBuilder();

			for (int j = 0; j < common.length() && j < strs[i+1].length(); j++) {
				if (common.charAt(j) == strs[i+1].charAt(j)) {
					sb.append(Character.toString(common.charAt(j)));
				}
			}

			common = sb.toString();
		}

		return common;

	}

	public static void main(String[] args) {

		String[] a = new String[] { "ra","racecar","race" };
		
		System.out.println(longestCommonPrefix(a));

	}

}
