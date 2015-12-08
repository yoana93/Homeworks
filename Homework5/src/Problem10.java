import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низа:");
		String str1 = sc.nextLine();
		String str2="";
		for(int i=0; i<str1.length(); i++){
			str2=str2+(char)((int)str1.charAt(i)+5);
		}
		System.out.println(str2);

	}

}
