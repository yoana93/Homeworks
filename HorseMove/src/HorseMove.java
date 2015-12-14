import java.util.Scanner;
public class HorseMove {
	
	static boolean isValid(char[][] arr, int x,int y){
		int n=arr.length;
		int m=arr[0].length;
		if(x<0 || x>=n || y<0 || y>=m){
			return false;
		}
		return true;
		
	}
	static boolean isEmpty(char[][] arr, int x,int y){
		if(isValid(arr,x,y)!=false && (int)arr[x][y]==0){
			return true;
		}
		return false;
	}

	static int[][] getHeighbours(int[][] arrNew,char[][] arr,int x,int y){
		for(int i=0; i<arrNew.length; i++){
			for(int j=0; j<arrNew[0].length; j++){
				arrNew[i][j]=-1;
			}
		}
		if(isEmpty(arr, x-2,y-1)){
			arrNew[0][0]=x-2;
			arrNew[0][1]=y-1;
		}
		if(isEmpty(arr, x-1,y-2)){
			arrNew[1][0]=x-1;
			arrNew[1][1]=y-2;
		}
		if(isEmpty(arr, x+1,y-2)){
			arrNew[2][0]=x+1;
			arrNew[2][1]=y-2;
		}
		if(isEmpty(arr, x+2,y-1)){
			arrNew[3][0]=x+2;
			arrNew[3][1]=y-1;
		}
		if(isEmpty(arr, x+2,y+1)){
			arrNew[4][0]=x+2;
			arrNew[4][1]=y+1;
		}
		if(isEmpty(arr, x+1,y+2)){
			arrNew[5][0]=x+1;
			arrNew[5][1]=y+2;
		}if(isEmpty(arr, x-1,y+2)){
			arrNew[6][0]=x-1;
			arrNew[6][1]=y+2;
		}
		if(isEmpty(arr, x-2,y+1)){
			arrNew[7][0]=x-2;
			arrNew[7][1]=y+1;
		}
		return arrNew;
		
	}

	
	static void DFS(char[][] arr, int x, int y) {
		
		if ((int) arr[x][y] == 0) {
			arr[x][y] = 'p';
			int[][] arrNew = new int[8][2];
			getHeighbours(arrNew, arr, x, y);
			for (int i = 0; i < arrNew.length; i++) {
				int x1 = arrNew[i][0];
				int y1 = arrNew[i][1];
				if (x1 != -1 && y1 != -1) {
						DFS(arr, arrNew[i][0], arrNew[i][1]);
					}
				}
			}
			arr[x][y] = '.';
		}

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert n:");
		int n=sc.nextInt();
		System.out.println("Insert m:");
		int m=sc.nextInt();
		char[][] arr=new char[n][m];
		int x=-1;
		int y=-1;
		while(isValid(arr,x,y)==false){
			System.out.println("Insert x:");
			x=sc.nextInt();
			System.out.println("Insert y:");
			y=sc.nextInt();
		}
		DFS(arr,x,y);
		for(int i=0; i<m; i++){
			System.out.print(" "+"-");
		}
		System.out.println();
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if((int)arr[i][j]==0){
					arr[i][j]=' ';
				}
				System.out.print("|"+arr[i][j]);
			}
			System.out.println("|");
			for(int k=0; k<m; k++){
				System.out.print(" "+"-");
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
