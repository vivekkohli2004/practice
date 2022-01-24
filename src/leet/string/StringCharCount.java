package leet.string;

public class StringCharCount {

	public static void main(String[] args) {
		String x = "yyyybbbbdexxxxxxx";

		String y = "yyyybbbbdexxxxxxk";

		countChars(y);
	}

	private static void countChars(String x) {

		StringBuffer output = new StringBuffer();
		int count = 1;
		for (int i = 1; i < x.length(); i++) {
			if (x.charAt(i) != x.charAt(i - 1)) {
				output.append(x.charAt(i - 1));
				if (count > 1) {
					output.append(count);
				}
				count = 1;
			} else {
				++count;
			}
		}
		output.append(x.charAt(x.length() - 1));
		if (count > 1) {
			output.append(count);
		}
		System.out.println(output.toString());
	}

}

/*
 * if (x.charAt(i) != x.charAt(i + 1) || i + 1 == x.length() - 1) {
 * output.append(x.charAt(i)); if (count != 1) { if (i + 1 == x.length() - 1) {
 * output.append(++count); } else { output.append(count); } } count = 1; } else
 * { count++; }
 */