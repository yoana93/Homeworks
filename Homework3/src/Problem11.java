import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		System.out.println("Въведете масива:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				count++;
				System.out.print(arr[i] + " ");
			}
		}
		if(count==1){
			System.out.println(count + " число");
		}
		else{
			System.out.println(count + " числа");
		}
		

	}

}
