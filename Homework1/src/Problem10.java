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
			System.out.println(b + " ���� �� 2 �����, " + b + " ���� �� 3 �����");
			break;
		case 1:
			System.out.println((b + 2) + " ���� �� 2 �����, " + (b - 1) + " ���� �� 3 �����");
			break;
		case 2:
			System.out.println((b + 1) + " ���� �� 2 �����, " + b + " ���� �� 3 �����");
			break;
		case 3:
			System.out.println(b + " ���� �� 2 �����, " + (b + 1) + " ���� �� 3 �����");
			break;
		case 4:
			System.out.println((b + 2) + " ���� �� 2 �����, " + b + " ���� �� 3 �����");
			break;

		}

	}

}
