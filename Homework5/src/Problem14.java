
public class Problem14 {

	static double fact(int n){
		if(n==0){
			return 1;
		}
		if(n>0){
			return n*fact(n-1);
		}
		return 1.0/fact(-n);
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact(-3));



	}

}
