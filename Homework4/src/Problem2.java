import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Insert the array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][arr.length - 1 - i] + " ");
		}

	}

}
