import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a:");
		double a = sc.nextDouble();
		System.out.println("Insert b:");
		double b = sc.nextDouble();
		if (a < b) {
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println(b);
			System.out.println(a);
		}

	}

}
