import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низа:");
		String str = sc.nextLine();
		int l=str.length();
		boolean flag=true;
		for(int i=0; i<l; i++){
			if(str.charAt(i)!=str.charAt(l-i-1)){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("да");
		}
		else{
			System.out.println("не");
		}

	}

}
