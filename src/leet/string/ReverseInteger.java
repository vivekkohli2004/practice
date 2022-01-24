package leet.string;

public class ReverseInteger {

	public static int reverse(int x) {
		int rev = 0;

		while (x != 0) {
			int rem = x % 10;
			x /= 10;
			rev = rev * 10 + rem;
			if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
				return 0;
			}

		}
		return (int) rev;
	}

	public static void main(String[] args) {

		System.out.println(reverse(563));

	}

}
