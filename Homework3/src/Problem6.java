import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the size of the 1st array:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Insert the 1st array:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Insert the size of the 2nd array:");
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		System.out.println("Insert the 2nd array:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		if (arr1.length != arr2.length) {
			System.out.println("The arrays are differant.");
			System.out.println("The arrays are with differant lengths.");
		} else {
			boolean flag = true;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("The arrays are the same.");
			} else {
				System.out.println("The arrays are differant");
			}
			System.out.println("The lengths of the arrays are the same.");
		}

	}

}
