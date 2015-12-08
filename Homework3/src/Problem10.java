import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[7];
		System.out.println("Insert the array:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		double aver = 0;
		for (int i = 0; i < arr1.length; i++) {
			aver = aver + arr1[i];
		}
		aver = aver / 7.0;
		double[] arr2 = new double[7];
		for (int i = 0; i < arr1.length; i++) {
			double tmp = arr1[i] - aver;
			arr2[i] = tmp > 0 ? tmp : -tmp;
		}
		double min = arr2[0];
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];
				index = i;
			}
		}
		System.out.println("средна стойност: " + aver);
		System.out.println("най-близка стойност: " + arr1[index]);

	}

}
