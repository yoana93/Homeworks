import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n < 1 || n > 999) {
			System.out.println("Insert N:");
			n = sc.nextInt();
		}
		int tmp=n+1;
		int br=0;
		while(br<=9){
			if(tmp%2==0 || tmp%3==0 || tmp%5==0 ){
				br++;
				System.out.println(br+" : "+tmp);
				
			}
			tmp++;
		}

	}

}
