import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 10 || n > 99) {
			System.out.println("Insert N:");
			n = sc.nextInt();
		}
		while(n!=1){
			if(n%2==0){
				n=n/2;
			}
			else{
				n=3*n+1;
			}
			System.out.print(n+ " ");
		}
		System.out.println();

	}

}
