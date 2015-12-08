import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 1 || n > 9) {
			System.out.println("Insert N:");
			n = sc.nextInt();
		}
		int m = 0;
		while (m < 1 || m > 9) {
			System.out.println("Insert M:");
			m = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}

	}

}
