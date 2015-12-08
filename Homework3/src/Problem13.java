import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		while (n < 0) {
			System.out.println("Insert n:");
			n = sc.nextInt();
		}
		int[] arr = new int[32];
		int var = n;
		int i = 0;
		while (var > 0) {
			arr[arr.length - 1 - i] = var % 2;
			var = var / 2;
			i++;
		}

		i = 0;
		while (arr[i] == 0) {
			i++;
		}

		for (int j = i; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
		System.out.println();

	}

}
