import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the string:");
		String str = sc.nextLine();
		String[] tmp = str.split(" ");
		for (int i = 0; i < tmp.length; i++) {
			char c = tmp[i].charAt(0);
			if (c >= 'a') {
				c = (char) (c - 'a' + 'A');
			}
			tmp[i] = c + tmp[i].substring(1);
		}
		str = tmp[0] + " ";
		for (int i = 1; i < tmp.length; i++) {
			str = str + tmp[i] + " ";
		}
		System.out.println(str);

	}

}
