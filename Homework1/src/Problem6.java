import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a1:");
		double a = sc.nextDouble();
		System.out.println("Insert a2:");
		double b = sc.nextDouble();
		System.out.println("Insert a3:");
		double c = sc.nextDouble();
		double tmp = a;
		a = b;
		b = c;
		c = tmp;
		System.out.println("a1=" + a);
		System.out.println("a2=" + b);
		System.out.println("a3=" + c);

	}

}
