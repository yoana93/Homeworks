import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		while(n<3){
			System.out.println("Въведете размера на масива:");
			n = sc.nextInt();
		}
		double[] arr = new double[n];
		System.out.println("Въведете масива:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		double[] arr1 = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i] >= 0 ? arr[i] : -arr[i];
		}
		double max = arr1[0] + arr1[1] + arr1[2];
		int a = 0;
		int b = 1;
		int c = 2;
		boolean flag=false;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				for (int k = j + 1; k < arr1.length; k++) {
					double tmp = arr1[i] + arr1[j] + arr1[k];
					if (tmp > max && arr1[i] != arr1[j] && arr1[j] != arr1[k] && arr1[k] != arr1[i]) {
						max = tmp;
						a = i;
						b = j;
						c = k;
						flag=true;
					}
				}
			}
		}
		if(flag==true || (arr1[0] != arr1[1] && arr1[1] != arr1[2] && arr1[2] != arr1[0])){
			System.out.println(arr[a] + "; " + arr[b] + "; " + arr[c]);
		}
		else{
			System.out.println("Няма такава тройка числа.");
		}

	}

}
