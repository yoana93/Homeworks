import java.util.Scanner;


public class EncDec {

	static String encrypt(char[][] arr, char a, char b) {
		String str = "";
		int x = -1, y = -1, x1 = -1, y1 = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == a) {
					x = i;
					y = j;
				}
				if (arr[i][j] == b) {
					x1 = i;
					y1 = j;
				}
			}
		}

		if (x != x1 && y != y1) {
			str = str + arr[x][y1] + arr[x1][y];
			return str;
		}
		if (x == x1 && y == y1) {
			str = str + arr[x][y] + arr[x1][y1];
			return str;
		}
		if (x != x1) {
			int tmp = x + 1;
			if (tmp > arr.length - 1) {
				tmp = 0;
			}
			str = str + arr[tmp][y];
			tmp = x1 + 1;
			if (tmp > arr.length - 1) {
				tmp = 0;
			}
			str = str + arr[tmp][y1];
			return str;
		}

		int tmp = y + 1;
		if (tmp > arr.length - 1) {
			tmp = 0;
		}
		str = str + arr[x][tmp];
		tmp = y1 + 1;
		if (tmp > arr.length - 1) {
			tmp = 0;
		}
		str = str + arr[x1][tmp];
		return str;

	}
	
	static String decrypt(char[][] arr, char a, char b) {
		String str = "";
		int x = -1, y = -1, x1 = -1, y1 = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == a) {
					x = i;
					y = j;
				}
				if (arr[i][j] == b) {
					x1 = i;
					y1 = j;
				}
			}
		}

		if (x != x1 && y != y1) {
			str = str + arr[x][y1] + arr[x1][y];
			return str;
		}
		if (x == x1 && y == y1) {
			str = str + arr[x][y] + arr[x1][y1];
			return str;
		}
		if (x != x1) {
			int tmp = x - 1;
			if (tmp < 0) {
				tmp = arr.length-1;
			}
			str = str + arr[tmp][y];
			tmp = x1 - 1;
			if (tmp < 0) {
				tmp = arr.length-1;
			}
			str = str + arr[tmp][y1];
			return str;
		}

		int tmp = y - 1;
		if (tmp <0) {
			tmp = arr.length-1;
		}
		str = str + arr[x][tmp];
		tmp = y1 - 1;
		if (tmp <0) {
			tmp =arr.length-1;
		}
		str = str + arr[x1][tmp];
		return str;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr={
				{'I','F','B','X','M'},
				{'A','O','J','E','T'},
				{'G','L','R','U','Q'},
				{'Y','N','H','D','V'},
				{'C','S','P','W','K'}
		};
		String str=sc.nextLine();
		str=str.toUpperCase();
		if(str.length()%2==1){
			str=str+'A';
		}
		String tmp="";
		for(int i=0; i<str.length(); i+=2){
			tmp=tmp+encrypt(arr,str.charAt(i),str.charAt(i+1));
		}
		System.out.println(tmp);
		String tmp1="";
		for(int i=0; i<tmp.length(); i+=2){
			tmp1=tmp1+decrypt(arr,tmp.charAt(i),tmp.charAt(i+1));
		}
		System.out.println(tmp1);
		

	}

}
