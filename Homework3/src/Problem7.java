import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the size of the array:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Insert the array:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[n];
		arr2[0] = arr1[1] + arr1[arr1.length - 1];
		arr2[arr2.length - 1] = arr1[arr1.length - 2] + arr1[0];
		for (int i = 1; i < arr2.length - 1; i++) {
			arr2[i] = arr1[i - 1] + arr1[i + 1];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

	}

}
