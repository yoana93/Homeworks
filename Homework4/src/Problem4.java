
public class Problem4 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
