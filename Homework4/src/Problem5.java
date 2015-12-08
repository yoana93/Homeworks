
public class Problem5 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int sumRow = 0;
		for (int j = 0; j < arr[0].length; j++) {
			sumRow = sumRow + arr[0][j];
		}
		for (int i = 1; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			if (sum > sumRow) {
				sumRow = sum;
			}
		}
		int sumCol = 0;
		for (int i = 0; i < arr.length; i++) {
			sumCol = sumCol + arr[i][0];
		}
		for (int j = 1; j < arr[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i][j];
			}
			if (sum > sumCol) {
				sumCol = sum;
			}
		}
		System.out.println("най-голямата сума по редове " + sumRow);
		System.out.println("най-голямата сума по колони " + sumCol);
		System.out.print("максималната сума по редове е ");
		if (sumRow > sumCol) {
			System.out.print("> ");
		}
		if (sumRow < sumCol) {
			System.out.print("< ");
		}
		if (sumRow == sumCol) {
			System.out.print("= ");
		}
		System.out.println("максималната сума по колони ");

	}

}
