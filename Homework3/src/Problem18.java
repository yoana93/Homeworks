import java.util.Scanner;

public class Problem18 {

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
		int[] arr2 = new int[n];
		System.out.println("Insert the 2nd array:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		int min = arr1.length > arr2.length ? arr1.length : arr2.length;
		int[] arrMax = new int[min];
		for (int i = 0; i < min; i++) {
			arrMax[i] = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arrMax.length; i++) {
			System.out.print(arrMax[i] + " ");
		}
		System.out.println();

	}

}
