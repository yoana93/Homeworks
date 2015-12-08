import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int tmpSum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(arr[i][j] + " ");
					tmpSum += arr[i][j];
					sum += arr[i][j];
				}
			}
			System.out.println("сума от елементите за реда " + tmpSum);
		}
		System.out.println("сума на елементите " + sum);

	}

}
