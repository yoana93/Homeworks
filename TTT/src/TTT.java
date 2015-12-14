import java.util.Scanner;

public class TTT {

	static void print(char[][] arr){
		for(int i=0; i<arr[0].length; i++){
			System.out.print(" "+"-");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if((int)arr[i][j]==0){
					arr[i][j]=' ';
				}
				System.out.print("|"+arr[i][j]);
			}
			System.out.println("|");
			for(int k=0; k<arr[i].length; k++){
				System.out.print(" "+"-");
			}
			System.out.println();
		}
	}
	static boolean isValid(char[][] arr,int x,int y){
		if(x<0 || x>arr.length || y<0 || y>=arr[x].length || arr[x][y]=='x' || arr[x][y]=='o'){
			return false;
		}
		return true;
	}
	static int[]  insert(char[][] arr, String str)
	{
		Scanner sc = new Scanner(System.in);
		int[] arrHelp=new int[2];
		int x=-1;
		int y=-1;
		while(isValid(arr,x,y)==false){
			System.out.println(str+": ");
			System.out.println("x: ");
			x=sc.nextInt();
			System.out.println("y: ");
			y=sc.nextInt();
		}
		if(str.equals("Player1")){
			arr[x][y]='x';
			
		}
		else{
			if(str.equals("Player2")){
				arr[x][y]='o';
				
			}
		}
		
		arrHelp[0]=x;
		arrHelp[1]=y;
		return arrHelp;
		
	}
	
	static boolean isWinnyMove(char[][] arr, int x, int y) {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][y] != arr[x][y]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(1);
			return true;
		}
		
		flag=true;
		for (int j = 0; j < arr[x].length; j++) {
			if (arr[x][j] != arr[x][y]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(2);
			return true;
		}
		
		flag=true;
		if (x == y) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][i] != arr[x][y]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(3);
				return true;
			}
		}
		

		flag=true;
		if ((x + y) == arr.length - 1) {

			for (int i = 0; i < arr.length; i++) {
				if (arr[i][arr.length - i - 1] != arr[x][y]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(4);
				return true;
			}
		}
		System.out.println(5);
		return false;

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr=new char[3][3];
		int[] arrHelp=new int[2];
		int i=0;
		do{
			String str;
			if(i%2==0){
				str="Player1";
			}
			else{
				str="Player2";
			}
			print(arr);
			arrHelp=insert(arr,str);
			i++;
		}
		while(isWinnyMove(arr,arrHelp[0], arrHelp[1])==false && i<9);
		if(i==9){
			System.out.println("Equal!");
		}
		else{
			if(arr[arrHelp[0]][arrHelp[1]]=='x'){
				System.out.println("Player1 won!");
			}
			else{
				if(arr[arrHelp[0]][arrHelp[1]]=='o'){
					System.out.println("Player2 won!");
				}
			}
		}
		print(arr);
		
		

	}

}
