package interview;

public class MatrixSummation {

	public static void main(String[] args) {

		int a[][] = new int[][] { { 1, 2 }, { 3, 4 } }; //test case 1

		//int a[][] = new int[][] { { 1, 2, 3}, { 4, 5, 6 } }; //test case 2 is also working.

		int sum[][] = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i][j] = dp(a, i, j); // CHANGE1 : removed sum[i][j] being added to dp() invocation.
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	private static int dp(int[][] a, int i, int j) {
		int sum = 0;
		for (int x = 0; x <= i; x++) { // CHANGE2: changed the < to <= in for loops
			for (int y = 0; y <= j; y++) {  
				sum += a[x][y];
			}
		}
		return sum;
	}

}
