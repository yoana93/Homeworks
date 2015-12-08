
public class Problem12 {
	static int[] buildArr(int n){
		int[] arr= new int[n];
		for(int i=0; i<n; i++){
			arr[i]=i+1;
		}
		return arr;
	}
	static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		printArr(buildArr(5));

	}

}
