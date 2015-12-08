import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 10 || n > 5555) {
			System.out.println("Insert N:");
			n = sc.nextInt();
		}
		int m = 0;
		while (m < 10 || m > 5555) {
			System.out.println("Insert M:");
			m = sc.nextInt();
		}
		if (n > m) {
			int tmp = n;
			n = m;
			m=tmp;
		}
		int a = m % 50;
		m = m - a;
		for (int i = m; i >= n; i = i - 50) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
