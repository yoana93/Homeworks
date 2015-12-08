import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низа:");
		String str = sc.nextLine();
		str = str + "0";
		int l = str.length();
		int sum = 0;
		int tmp = 0;
		boolean isPos = true;
		int br=0;
		for (int i = 0; i < l - 1; i++) {
			char c = str.charAt(i);
			if (c == '-' && str.charAt(i + 1) >= 0 && str.charAt(i + 1) <= 9) {
				isPos = false;
			}
			else{
			if (c >= 0 && c <= 9) {
				tmp = tmp * 10 + (c - '0');
				br = 0;
			} else {
				br++;
				if (br == 1) {
					if (isPos == false) {
						tmp = -tmp;
					}
					System.out.println(tmp);
					sum = sum + tmp;
					tmp = 0;
				} else {
					br++;
					isPos=true;

				}

			}
		}}

	}

}
