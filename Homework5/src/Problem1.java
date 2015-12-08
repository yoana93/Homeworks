import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1="";
		int l1=str1.length();
		while(l1<1 || l1>40){
			System.out.println("Insert the 1st string:");
			str1=sc.nextLine();
			l1=str1.length();
		}
		String str2="";
		int l2=str2.length();
		while(l2<1 || l2>40){
			System.out.println("Insert the 2nd string:");
			str2=sc.nextLine();
			l2=str2.length();
		}
		System.out.print(str1.toUpperCase()+" ");
		System.out.print(str1.toLowerCase()+" ");
		System.out.print(str2.toUpperCase()+" ");
		System.out.println(str2.toLowerCase());

	}

}
