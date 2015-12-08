import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете числото А:");
		int a = sc.nextInt();
		System.out.println("Въведете числото В:");
		int b = sc.nextInt();
		if (a <= b) {
			int sum = 0;
			for (int i = a; i <= b; i++) {
				if (i % 3 != 0) {
					System.out.print(i * i + ", ");
					sum = sum + i * i;
					if (sum > 200) {
						break;
					}
				} else {
					System.out.print("skip 3, ");
				}
			}
		} else {
			int sum = 0;
			for (int i = a; i >= b; i--) {
				if (i % 3 != 0) {
					System.out.print(i * i + ", ");
					sum = sum + i * i;
					if (sum > 200) {
						break;
					}
				} else {
					System.out.print("skip 3, ");
				}
			}

		}
		System.out.println();

	}
}
