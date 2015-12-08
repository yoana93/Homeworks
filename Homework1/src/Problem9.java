import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a < 10 || a > 99) {
			System.out.println("Insert a:");
			a = sc.nextInt();
		}
		int b = 0;
		while (b < 10 || b > 99) {
			System.out.println("Insert b:");
			b = sc.nextInt();
		}
		int prod = a * b;
		int tmp = prod % 10;
		System.out.print(prod + ", " + tmp);
		if (tmp % 2 == 0) {
			System.out.println(" четна");
		} else {
			System.out.println(" нечетна");
		}

	}

}
