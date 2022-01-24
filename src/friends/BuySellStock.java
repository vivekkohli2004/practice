package friends;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
public class BuySellStock {

	public static int maxProfit(int[] prices) {
		int maxprofit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1])
				maxprofit += prices[i] - prices[i - 1];
		}
		return maxprofit;
	}

	public static void main(String[] args) {
		// int a[]= new int[] {7,6,4,3,1};
		int a[] = new int[] { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(a));
	}

}

class Solution {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int cbp = prices[0];
		for (int j = 1; j < prices.length; j++) {
			if (prices[j] > cbp) {
				profit += (prices[j] - cbp);
			}
			cbp = prices[j];
		}
		return profit;
	}

}