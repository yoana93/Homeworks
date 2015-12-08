import java.util.Scanner;

public class Problem17 {

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
		if (arr.length <= 1) {
			flag = true;
		} else {
			if (arr[0] >= arr[1]) {
				flag = false;
			} else {
				int tmp = arr.length % 2;
				if (tmp == 0) {
					if (arr[arr.length - 1] > arr[arr.length - 2]) {
						flag = true;
					} else {
						flag = false;
					}
				} else {
					if (arr[arr.length - 1] < arr[arr.length - 2]) {

						flag = true;
					} else {
						flag = false;
					}
				}

			}
		}
		
		for (int i = 1; i < arr.length - 1; i++) {
			if (i % 2 == 1) {
				if (arr[i] <= arr[i - 1] || arr[i] <= arr[i + 1]) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag==true){
			System.out.println("изпълнява условията за зигзаобразна нагоре редица");
		}
		else{
			System.out.println("не изпълнява условията за зигзаобразна нагоре редица");
		}

	}

}
