package friends;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuySellStockOnce {

	public static void main(String[] args) {

		int a[] = new int[] { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(a));

	}

	public static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				if (prices[i] - min > maxProfit) {
					maxProfit = prices[i] - min;
				}
			}
		}

		return maxProfit;
	}

}
