
public class Problem3 {

	public static void main(String[] args) {
		double[][] arr = { { 48.5, 72, 13.3, 14, 15.74 }, { 21.1, 22, 53, 24.2, 75 }, { 31, 57.6, 33, 34, 35.8 },
				{ 41.4, 95, 43.5, 44, 45.7 }, { 59.2, 52, 53, 54.4, 55 }, { 61.74, 69.5, 63.123, 64, 65.6 } };
		double sum = 0;
		int br = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
				br++;
			}
		}
		double aver = sum / br;
		System.out.println("sum:" + sum);
		System.out.println("average:" + aver);

	}

}
