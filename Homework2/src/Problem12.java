
public class Problem12 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			for(int j=0; j<10; j++){
				int tmp=0;
				for(int k=0; k<10; k++){
					if(i!=j && j!=k && k!=i){
						tmp=i*100+j*10+k;
						System.out.println(tmp);
					}
				}
			}
		}
	

	}

}
