import java.util.Scanner;

public class problem13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (sum < 2 || sum > 27) {
			System.out.println("Insert sum:");
			sum = sc.nextInt();
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if ((i + j + k) == sum) {
						int tmp = i * 100 + j * 10 + k;
						System.out.print(tmp + " ");
					}
				}
			}
		}
		System.out.println();

	}

}
