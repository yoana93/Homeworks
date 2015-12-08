import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert N:");
		int n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid input!");
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n - 2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
//zad za upr
		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		if(n>0){
			System.out.println("*");
		}
	

		for (int i = 1; i < n - 1; i++) {
			for (int j = 0; j <= n - 2 - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		if(n>1){
		for (int k = 1; k <= 2 * (n - 1) + 1; k++) {
			System.out.print("*");
		}
		System.out.print("");

	}
	}

}
