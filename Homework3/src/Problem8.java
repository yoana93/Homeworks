import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Insert the array:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			int br = 1;
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					br++;
				} else {
					break;
				}
			}
			arr2[i] = br;
		}
		int max = arr2[0];
		int i = 0;
		for (int j = 1; j < arr2.length; j++) {
			if (arr2[j] > max) {
				max = arr2[j];
				i = j;
			}
		}
		for (int j = 0; j < max; j++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

	}

}
