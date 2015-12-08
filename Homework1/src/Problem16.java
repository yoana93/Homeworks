import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a < 100 || a > 999) {
			System.out.println("Insert a:");
			a = sc.nextInt();
		}
		int b = a / 100;
		int c = (a / 10) % 10;
		int d = a % 10;
		if (b == c && c == d) {
			System.out.println("Цифрите са равни.");
		} else {
			if (b > c && c > d) {
				System.out.println("Цифрите са в низходящ ред.");
			} else {
				if (b < c && c < d) {
					System.out.println("Цифрите са във възходящ ред.");
				} else {
					System.out.println("Цифрите са ненаредени.");
				}
			}
		}

	}

}
