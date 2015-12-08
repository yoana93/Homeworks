import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a < 10 || a > 9999) {
			System.out.println("Insert a:");
			a = sc.nextInt();
		}
		int b = a / 5;
		int c = a % 5;
		switch (c) {
		case 0:
			System.out.println(b + " пъти по 2 литра, " + b + " пъти по 3 литра");
			break;
		case 1:
			System.out.println((b + 2) + " пъти по 2 литра, " + (b - 1) + " пъти по 3 литра");
			break;
		case 2:
			System.out.println((b + 1) + " пъти по 2 литра, " + b + " пъти по 3 литра");
			break;
		case 3:
			System.out.println(b + " пъти по 2 литра, " + (b + 1) + " пъти по 3 литра");
			break;
		case 4:
			System.out.println((b + 2) + " пъти по 2 литра, " + b + " пъти по 3 литра");
			break;

		}

	}

}
