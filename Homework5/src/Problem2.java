import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1="";
		int l1=str1.length();
		while(l1<10 || l1>20){
			System.out.println("Insert the 1st string:");
			str1=sc.nextLine();
			l1=str1.length();
		}
		String str2="";
		int l2=str2.length();
		while(l2<10 || l2>20){
			System.out.println("Insert the 2nd string:");
			str2=sc.nextLine();
			l2=str2.length();
		}
		if(l1>l2){
			System.out.print(l1+" ");
		}
		else{
			System.out.print(l2+" ");
		}
		String str3=str1.substring(0, 5);
		String str4=str2.substring(0, 5);
		System.out.print(str1.replaceFirst(str3, str4)+" ");
		System.out.println(str2.replaceFirst(str4, str3));

	}

}
