import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� A:");
		double a = sc.nextDouble();
		System.out.println("�������� B:");
		double b = sc.nextDouble();
		System.out.println("�������� C:");
		double c = sc.nextDouble();
		if (b >= a) {
			if (c >= a && c <= b) {
				System.out.println("������� " + c + " � ����� " + a + " � " + b + ".");
			} else {
				System.out.println("������� " + c + " �� � ����� " + a + " � " + b + ".");
			}
		} else {
			if (c >= b && c <= a) {
				System.out.println("������� " + c + " � ����� " + b + " � " + a + ".");
			} else {
				System.out.println("������� " + c + " �� � ����� " + b + " � " + a + ".");
			}
		}

	}

}
