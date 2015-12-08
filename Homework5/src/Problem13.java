
public class Problem13 {

	static int[] mixedArr(int[] arr1, int[] arr2){
		int l=arr1.length+arr2.length;
		int[] arr=new int[l];
		for(int i=0; i<arr1.length; i++){
			arr[i]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++){
			arr[i+arr1.length]=arr2[i];
		}
		return arr;
	}
	
	static void printArr(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] a={1,3,6};
		int[] b={5,3,8,9};
		printArr(mixedArr(a,b));

	}

}
