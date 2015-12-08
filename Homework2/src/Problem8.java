import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 1) {
			System.out.println("Въведете n:");
			n = sc.nextInt();
		}
		int tmp = n - 1;
		int help = n;
		while (help > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print(tmp);
			}
			System.out.println();
			tmp = tmp + 2;
			help--;
		}

	}

}
