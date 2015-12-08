import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, x = 0, y = 0;
		while (a < 1 || a > 8) {
			System.out.println("Insert a:");
			a = sc.nextInt();
		}
		while (b < 1 || b > 8) {
			System.out.println("Insert b:");
			b = sc.nextInt();
		}
		while (x < 1 || x > 8) {
			System.out.println("Insert x:");
			x = sc.nextInt();
		}
		while (y < 1 || y > 8) {
			System.out.println("Insert y:");
			y = sc.nextInt();
		}
		if ((a % 2 == b % 2 && x % 2 == y % 2) || (a % 2 != b % 2 && x % 2 != y % 2)) {
			System.out.println("Позициите са с еднакъв цвят.");
		} else {
			System.out.println("Позициите са с различен цвят.");
		}

	}

}
