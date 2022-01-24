package leet.array;

//https://www.careercup.com/question?id=5800210660327424

public class RemoveMultipleOccurences {

	public static void main(String[] args) { //remove 3 or more occurrences of a char
		String x = "ABCCCCBBA";

		for (int i = 0; i < x.length(); i++) {
			int j = i;

			while (j < x.length() && x.charAt(i) == x.charAt(j)) {

				j++;
			}
			if (j - i >= 3) {
				x = x.substring(0, i) + x.substring(j);
				i = 0;/// smart!!
			}

		}
		System.out.println(x);
	}

}
