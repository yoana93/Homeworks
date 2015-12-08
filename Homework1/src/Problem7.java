import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert hour:");
		int hour = sc.nextInt();
		System.out.println("Insert sum of money:");
		double money = sc.nextDouble();
		System.out.println("Insert isHealthy:");
		boolean isHealthy = sc.nextBoolean();
		if (isHealthy == true) {
			if (money < 10) {
				System.out.println("Ще отида на кафе.");
			} else {
				System.out.println("Ще отида на кино с приятели.");
			}
		} else {
			System.out.println("Няма да излизам.");
			if (money > 0) {
				System.out.println("Ще си купя лекарства.");
			} else {
				System.out.println("Ще си стоя вкъщи и ще пия чай.");
			}

		}

	}
}
