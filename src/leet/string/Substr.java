package leet.string;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
public class Substr {

	public static int strStr(String haystack, String needle) {

		int k;
		for (int i = 0; i < haystack.length() - needle.length(); i++) {
			k = i;
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(k++) == needle.charAt(j)) {
					if (j == needle.length() - 1)
						return i;
				} else {
					break;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		String hay = "";
		String needle = "";
		System.out.println(strStr(hay, needle));

	}

}
