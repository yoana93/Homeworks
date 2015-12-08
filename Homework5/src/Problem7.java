import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низа:");
		String str = sc.nextLine();
		int count=0;
		int max=0;
		int tmp=0;
		str=str.trim();
		for(int i=0; i<str.length(); i++){
			tmp++;
			if(str.charAt(i)==' '){
				count++;
				tmp--;
				if(tmp>max){
					max=tmp;
				}
				
				tmp=0;
			}
			if(i==str.length()-1){
				count++;
				if(tmp>max){
					max=tmp;
				}
				
				tmp=0;
			}
			
			
		}
		System.out.println(count+" думи, най-дългата е с "+max+" символа");
		

	}

}
