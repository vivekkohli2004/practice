package leet.array;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=yFfv03AE_vA
//https://leetcode.com/problems/combination-sum/
public class CombinationSum {

	static List<List<Integer>> result = new ArrayList<>();
	public static void main(String[] args) {

		int[] a = new int[] { 2, 3, 6, 7 };
		List<List<Integer>> l = combinationSum(a, 7);
		
		System.out.println(l);

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		calculate(candidates, 0, target, new ArrayList<>());
		return result;

	}

	public static void calculate(int[] candidates, int start, int target, List<Integer> currList) {

		if (target < 0) {
			return;
		}
		if (target == 0) {
			result.add(new ArrayList<>(currList));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			currList.add(candidates[i]);
			calculate(candidates, i, target - candidates[i], currList);
			currList.remove(currList.size()-1);
		}

	}
}
