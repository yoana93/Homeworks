import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете A:");
		double a = sc.nextDouble();
		System.out.println("Въведете B:");
		double b = sc.nextDouble();
		System.out.println("Въведете C:");
		double c = sc.nextDouble();
		if (b >= a) {
			if (c >= a && c <= b) {
				System.out.println("Числото " + c + " е между " + a + " и " + b + ".");
			} else {
				System.out.println("Числото " + c + " не е между " + a + " и " + b + ".");
			}
		} else {
			if (c >= b && c <= a) {
				System.out.println("Числото " + c + " е между " + b + " и " + a + ".");
			} else {
				System.out.println("Числото " + c + " не е между " + b + " и " + a + ".");
			}
		}

	}

}
