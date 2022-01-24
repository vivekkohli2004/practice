package leet.string;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		boolean proceed = true;
		// for(int i=0, j=s.length()-1;i<s.length()/2 && proceed;i++,j--){ //doesnt work
		// in edge cases like ",,,,,,,,,,,,acva"
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (i < j && (s.charAt(i) == ' ' || !Character.isLetterOrDigit(s.charAt(i)))) {
				i++;
			}
			while (i < j && (s.charAt(j) == ' ' || !Character.isLetterOrDigit(s.charAt(j)))) {
				j--;
			}

			if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(",,,,,,,,,,,,acca"));
	}
}
