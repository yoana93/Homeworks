import java.util.Scanner;

public class Problem9 {

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
			arr2[i] = arr1[arr1.length - 1 - i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		
		
		for (int i = 0; i < arr1.length / 2; i++) {
			int tmp = arr1[i];
			arr1[i] = arr1[arr1.length - 1 - i];
			arr1[arr1.length - 1 - i] = tmp;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

	}

}
