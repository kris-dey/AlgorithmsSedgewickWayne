package Chapter1;

public class Array30 {
	public static void main(String[] args) {
		boolean[][] a = createBooleanArray(8); 
		boolean2DPrint11(a);
	}
	
	public static boolean[][] createBooleanArray(int N){
		boolean [][] a = new boolean[N][N];
		for(int i=0; i<N; i++)
			for(int j=0; j<N;j++){
				if(coPrime(i,j)) a[i][j] = true;
				else a[i][j] = false;
			}
		return a;
	}
	
	public static boolean coPrime(int n1, int n2){
		int factor = 2;
		while(factor<n1||factor<n2){
			if(n1%factor==0&&n2%factor==0) return false;
			factor++;
		}
		return true;
	}
	
	public static void boolean2DPrint11(boolean [][] b){
		int rowSize = b.length;
		int columnSize = b[0].length;
		int rowCount = 0, columnCount = 0;
		System.out.print(" ");
		for(int k=0; k<columnSize;k++) System.out.print(columnCount++);
		System.out.println();
		for(int i=0; i<rowSize; i++){
			System.out.print(rowCount++);
			for(int j=0; j<columnSize;j++){
				if(b[i][j]==true) System.out.print("T");
				else System.out.print("F");
			}
			System.out.println();
		}
	}
}
