import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("�������� ������� �����:");
		a = sc.nextInt();
		System.out.println("�������� ������� �����:");
		b = sc.nextInt();
		if(a<=b){
			for(int i=a; i<=b; i++){
				System.out.print(i+" ");
		}

	}
		else{
			for(int i=b; i<=a; i++){
				System.out.print(i+" ");
		}
		}

}}
