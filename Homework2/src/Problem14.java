import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 10 || n > 200) {
			System.out.println("Insert N:");
			n = sc.nextInt();
		}
		int a=n%7;
		int tmp;
		if(a==0){
			tmp=n-7;
		}
		else{
			tmp=n-a;
		}
		for(int i=tmp; i>=0; i=i-7){
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
