import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		while (b < 3 || b > 20) {
			System.out.println("Insert b:");
			b = sc.nextInt();
		}
		System.out.println("Insert c:");
	    char c = sc.next().charAt(0);
	    for(int i=0; i<b; i++){
	    	System.out.print("*");
	    }
	    System.out.println();
	    for(int i=1; i<b-1; i++){
	    	System.out.print("*");
	    	for(int j=1; j<b-1; j++){
	    		System.out.print(c);
	    	}
	    	System.out.print("*");
	    	System.out.println();
	    }
	    for(int i=0; i<b; i++){
	    	System.out.print("*");
	    }
		

	}

}
