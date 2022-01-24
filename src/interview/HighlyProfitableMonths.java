package interview;

import java.util.ArrayList;
import java.util.List;

//Blackrock
//Find the count of consecutively increasing stock prices for k months
public class HighlyProfitableMonths {
	
	public static int countHighlyProfitableMonths(List<Integer> stockPrices, int k) {
		
		int count =1;
		int result =0;
		for(int i=1;i<stockPrices.size();i++) {
			if(stockPrices.get(i) > stockPrices.get(i-1)) {
				count++;
			}else {
				count =1;
			}
			if(count>=k) {
				result++;
			}
		}
		
		return result;
	}

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); // 1 2 3 3 4 5 7 9
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(9);
		
		
		System.out.println(countHighlyProfitableMonths(list, 3));
	}
}
