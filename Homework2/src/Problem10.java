import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������� �:");
		int a = sc.nextInt();
		if(a<=1){
			System.out.println(a+" �� � ������.");
		}
		else{
			boolean flag=true;
			for(int i=2; i*i<=a; i++){
				if(a%i==0 && a!=i){
					System.out.println(a+" �� � ������.");
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println(a+" � ������.");
			}

		}
		
	}

}
