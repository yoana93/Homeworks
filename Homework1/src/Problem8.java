import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a < 1000 || a > 9999) {
			System.out.println("Insert a:");
			a = sc.nextInt();
		}
		int b = 0, c = 0;
		b = (a / 1000) * 10 + a % 10;
		c = ((a / 100) % 10) * 10 + (a % 100) / 10;
		if (b < c) {
			System.out.println("по-малко (" + b + " < " + c + ")");
		} else {
			if (b == c) {
				System.out.println("равни (" + b + " = " + c + ")");
			} else {
				System.out.println("по-голямо (" + b + " > " + c + ")");
			}
		}

	}

}
