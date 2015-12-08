import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 1) {
			System.out.println("Insert N:");
			n = sc.nextInt();
		}
		int fact = 1;
		int br = 1;
		do {
			fact = fact * br;
			br++;
		} while (br <= n);
		System.out.println("N!="+fact);

	}

}
