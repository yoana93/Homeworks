import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Insert the array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int tmp = n / 2;
		int[] arrHelp = new int[2 * tmp];
		for (int i = 0; i < tmp; i++) {
			arrHelp[i] = arr[i];
			arrHelp[2 * tmp - 1 - i] = arr[i];
		}
		for (int i = 0; i < arrHelp.length; i++) {
			System.out.print(arrHelp[i] + " ");
		}
		System.out.println();

	}

}
