import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int day = 0;
		while (day < 1 || day > 31) {
			System.out.println("Insert day:");
			day = sc.nextInt();
		}

		int mounth = 0;
		while (mounth < 1 || mounth > 31) {
			System.out.println("Insert mounth:");
			mounth = sc.nextInt();
		}

		System.out.println("Insert year:");
		int year = sc.nextInt();

		if (day < 28) {
			System.out.println((day + 1) + " " + mounth + " " + year);
		}

		if ((day == 28 || day == 29) && mounth != 2) {
			System.out.println((day + 1) + " " + mounth + " " + year);
		}

		if (day == 30) {
			switch (mounth) {
			case 4:
				;
			case 6:
				;
			case 9:
				;
			case 11:
				System.out.println(1 + " " + (mounth + 1) + " " + year);
				break;
			case 2:
				System.out.println("Wrong date!");
				break;
			default:
				System.out.println((day + 1) + " " + mounth + " " + year);
				break;
			}
		}

		if (day == 31) {
			switch (mounth) {
			case 1:
				;
			case 3:
				;
			case 5:
				;
			case 7:
				;
			case 8:
				;
			case 10:
				System.out.println(1 + " " + (mounth + 1) + " " + year);
				break;
			case 12:
				System.out.println(1 + " " + 1 + " " + (year + 1));
				break;
			default:
				System.out.println("Wrong date!");
				break;

			}
		}
		if (mounth == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				if (day == 28) {
					System.out.println((day + 1) + " " + mounth + " " + year);
				} else {
					if (day == 29) {
						System.out.println(1 + " " + (mounth + 1) + " " + year);
					}
				}
			} else {
				if (day == 28) {
					System.out.println(1 + " " + (mounth + 1) + " " + year);
				} else {
					if (day == 29) {
						System.out.println("Wrong date!");
					}
				}
			}

		}

	}
}
