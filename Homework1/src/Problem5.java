import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a:");
		double a = sc.nextDouble();
		System.out.println("Insert b:");
		double b = sc.nextDouble();
		System.out.println("Insert c:");
		double c = sc.nextDouble();
		if (c >= b && c >= a) {
			if (b >= a) {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			} else {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
		} else {
			if (b >= a) {
				if (c >= a) {
					System.out.println(b);
					System.out.println(c);
					System.out.println(a);
				} else {
					System.out.println(b);
					System.out.println(a);
					System.out.println(c);
				}
			} else {
				if (b >= c) {
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
				} else {
					System.out.println(a);
					System.out.println(c);
					System.out.println(b);
				}
			}
		}

	}

}
