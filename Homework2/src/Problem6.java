import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Въведете число:");
		a = sc.nextInt();
		int sum=0;
		if(a>=1){
			for(int i=1; i<=a; i++){
				sum+=i;
		}
		}
		else{
			for(int i=1;i>=a;i--){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
