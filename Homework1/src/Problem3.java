import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a:");
		double a = sc.nextDouble();
		System.out.println("Insert b:");
		double b = sc.nextDouble();
		double tmp = a;
		a = b;
		b = tmp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
