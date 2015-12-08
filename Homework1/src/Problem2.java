import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a:");
		int a = sc.nextInt();
		int b = a;
		while (b == a) {
			System.out.println("Insert b:");
			b = sc.nextInt();
		}
		int sum = a + b;
		int subt = a - b;
		int product = a * b;
		System.out.println("a+b=" + sum);
		System.out.println("a-b=" + subt);
		System.out.println("a*b=" + product);
		if (b == 0) {
			System.out.println("a/b=Error!");
			System.out.println("a%b=Error!");
		} else {
			int div = a / b;
			int rem = a % b;
			System.out.println("a/b=" + div);
			System.out.println("a%b=" + rem);
		}

		System.out.println("Insert c:");
		double c = sc.nextDouble();
		double d = c;
		while (d == c) {
			System.out.println("Insert d:");
			d = sc.nextDouble();
		}
		double sum1 = c + d;
		double subt1 = c - d;
		double product1 = c * d;
		System.out.println("c+d=" + sum1);
		System.out.println("c-d=" + subt1);
		System.out.println("c*d=" + product1);
		if (d == 0.0) {
			System.out.println("a/b=Error!");
		} else {
			double div1 = c / d;
			System.out.println("c/d=" + div1);
		}

	}

}
