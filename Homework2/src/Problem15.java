import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.println("Insert N:");
		n = sc.nextInt();

		int sum = 0;
		if (n >= 1) {
			do{
				sum=sum+n;
				n--;
			}
			while(n>0);

		} else {
			do{
				sum=sum+n;
				n++;
			}
			while(n<=1);
		}
		System.out.println("sum:"+sum);

	}
}
