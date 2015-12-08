import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 10 || n > 30000) {
			System.out.println("Insert N:");
			n = sc.nextInt();
		}
		int tmp1=n;
		int tmp2=0;
		do{
			tmp2=tmp2*10+tmp1%10;
			tmp1=tmp1/10;
		}
		while(tmp1>0);
		if(tmp2==n){
			System.out.println("числото е палиндром");
		}
		else{
			System.out.println("числото не е палиндром");
		}

	}

}
