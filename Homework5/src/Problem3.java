import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=" ";
		while(str1.contains(" ")){
			System.out.println("Insert the 1st string:");
			str1=sc.nextLine();
		}
		String str2=" ";
		while(str2.contains(" ")){
			System.out.println("Insert the 2nd string:");
			str2=sc.nextLine();
		}
		if(str1.length()==str2.length()){
			System.out.println("Двата низа са с равна дължина.");
		}
		else{
			System.out.println("Двата низа са с различна дължина.");
		}
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		int len= str1.length() <= str2.length() ? str1.length():str2.length();
		System.out.println("Разлика по позициите:");
		for(int i=0; i<len; i++){
			if(arr1[i]!=arr2[i]){
				System.out.println((i+1)+" "+arr1[i]+"-"+arr2[i]);
			}
		}

	}

}
