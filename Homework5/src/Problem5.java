import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the 1st string:");
		String str1 = sc.nextLine();
		System.out.println("Insert the 2nd string:");
		String str2 = sc.nextLine();
		boolean flag=false;
		int i;
		for(i=0; i<str1.length(); i++){
			if(str2.indexOf(str1.charAt(i))!=-1){
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("The strings dont have common element.");
		}
		else{
			int tmp=str2.indexOf(str1.charAt(i));
			for(int j=0; j<tmp; j++){
				for(int k=0; k<i; k++){
					System.out.print(" ");
				}
				System.out.println(str2.charAt(j));
			}
			System.out.println(str1);
			for(int j=tmp+1; j<str2.length(); j++){
				for(int k=0; k<i; k++){
					System.out.print(" ");
				}
				System.out.println(str2.charAt(j));
			}
		}
		
		

	}

}
