import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert two names:");
		String str=sc.nextLine();
		String[] name=str.split(", ");
		if(name.length<2){
			System.out.println("Error!");
		}else
		{
			char[] name1=name[0].toCharArray();
			char[] name2=name[1].toCharArray();
			int sum1=0;
			int sum2=0;
			for(int i=0; i<name1.length; i++){
				sum1=sum1+name1[i];
			}
			for(int i=0; i<name2.length; i++){
				sum2=sum2+name2[i];
			}
			if(sum1>sum2){
				System.out.println(name1);
			}else{
				System.out.println(name2);
			}

		}
		
	}

}
