import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = -1;
		while (hour < 0 || hour > 24) {
			System.out.println("Въведете час:");
			hour = sc.nextInt();
		}
		if (hour >= 4 && hour < 9) {
			System.out.println("Добро утро!");
		} else {
			if (hour >= 9 && hour < 18) {
				System.out.println("Добър ден!");
			} else {
				System.out.println("Добър вечер!");
			}
		}

	}

}
