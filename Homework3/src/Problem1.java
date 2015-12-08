import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Insert the array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int tmp = 1;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				tmp = arr[i];
				j = i;
				break;
			}
		}
		if (tmp == 1) {
			System.out.println("There is no such number.");
		} else {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i] % 3 == 0 && arr[i] < tmp) {
					tmp = arr[i];
				}
			}
			System.out.println(tmp);
		}

	}

}
