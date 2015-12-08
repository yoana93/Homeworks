import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Insert the array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		for (int i = 0; i < (arr.length / 2); i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			System.out.println("no");
		} else {
			System.out.println("yes");
		}

	}

}
