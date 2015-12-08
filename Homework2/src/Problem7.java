import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		while(n<1){
			System.out.println("Въведете n:");
			n = sc.nextInt();
		}
		for(int i=1; i<n; i++){
			System.out.print(3*i+",");
		}
		System.out.println(3*n);
	}

}
