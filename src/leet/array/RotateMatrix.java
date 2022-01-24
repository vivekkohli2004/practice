package leet.array;

//https://leetcode.com/problems/rotate-image
public class RotateMatrix {
	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);

			}
		}
		// System.out.println(matrix);
	}

	public static void rotate(int[][] matrix) {
		int temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) { // ***** can also use j=i transpose of Matrix
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp = matrix[j][i];
				matrix[j][i] = matrix[j][matrix.length - i - 1];
				matrix[j][matrix.length - i - 1] = temp;
			}
		}
	}
}
