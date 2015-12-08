import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = 150;
		while (t < -100 || t > 100) {
			System.out.println("Insert t:");
			t = sc.nextDouble();
		}
		if (t < -20) {
			System.out.println("ледено студено");
		} else {
			if (t < 0) {
				System.out.println("студено");
			} else {
				if (t < 15) {
					System.out.println("хладно");
				} else {
					if (t < 25) {
						System.out.println("топло");
					} else {
						System.out.println("горещо");
					}
				}
			}
		}

	}

}
