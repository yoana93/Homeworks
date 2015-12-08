import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = a / 100;
		int c = (a / 10) % 10;
		int d = a % 10;
		while (!((a >= 100 && a <= 999) && (b != 0 && c != 0 && d != 0))) {
			System.out.println("Insert a:");
			a = sc.nextInt();
			b = a / 100;
			c = (a / 10) % 10;
			d = a % 10;
		}
		if (a % b == 0 && a % c == 0 && a % d == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
