package Chapter1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FundamentalsBasic {

	public static void main(String[] args) {
		
		/* boolean2DPrint11
		boolean b[][] = {{true,true},{false,true}};
		boolean2DPrint11(b);
		*/
		
		/*
		arrayQ();
		*/
		
		/* transpose
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		transposition(a,3,3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
		*/
		
		/* lg()
		System.out.println(lg(127)); 
		*/
		
		/* histogram
		int a[] = {1,2,3,3,4,4,2,1,1,1,7,3,3,3,3,48,3};
		int b[] = histogram(a, 8);
		for(int i = 0;i<8;i++) System.out.print(b[i]);
		*/
		
		/* 1.1.21
		ArrayList<Player> p = readFile();
		printPlayers(p);
		*/
		/*
		int[] a ={2,4,6,7,9,11,12,16,45,256,156,445,5555};
		rank(2,a);
		*/
		System.out.println( binomial(100, 50,0.25));
		System.out.println(count);
	}
	
	public static void boolean2DPrint11(boolean [][] b){
		int rowSize = b.length;
		int columnSize = b[0].length;
		int rowCount = 1, columnCount = 1;
		System.out.print(" ");
		for(int k=0; k<columnSize;k++) System.out.print(columnCount++);
		System.out.println();
		for(int i=0; i<rowSize; i++){
			System.out.print(rowCount++);
			for(int j=0; j<columnSize;j++){
				if(b[i][j]==true) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void arrayQ(){
		int[] a = new int[10];
		for(int i = 0; i <10; i++)
			a[i] = 9-i;
		for(int i = 0; i <10; i++)
			a[i] = a[a[i]]; 	
		for(int i = 0; i <10; i++)
			System.out.println(i);
	}
	
	public static void transposition(int a[][], int M, int N){
		int temp = 0;
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				if(i>j){
					temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
		}
	}
	
	public static int lg(int N){
		int lg = 0;
		int twoPower = 1;
		while(twoPower<=N){
			lg++;
			twoPower *= 2;		
		}
		return --lg;
	}
	
	public static int[] histogram(int a[], int M){
		int[] b = new int[M];
		int count = 0;
		for(int i=0;i<M;i++){
			count = 0;
			for(int j=0;j<a.length;j++)
				if(a[j]==i) count++;
			b[i] = count;
		}
		return b;
	}
	
	public static ArrayList<Player> readFile(){
		ArrayList<Player> playerList = new ArrayList<Player>();
		try{
			FileReader fileReader = new FileReader("C:\\Users\\KrishanuDey\\Desktop\\Programming\\Eclipse Files\\AlgorithmsRobert\\src\\players.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			boolean eof=false;
			while(!eof){
				String playerListLine = bufferedReader.readLine();
				if(playerListLine!=null){
					String[] playerData = playerListLine.split(", ");
					String name = playerData[0];
					int runs = Integer.parseInt(playerData[1]);
					int matches = Integer.parseInt(playerData[2]);
					Player player = new Player(name,runs,matches); 
					playerList.add(player);
				} else{
					eof = true;
				}
			}
			bufferedReader.close();
			fileReader.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		return playerList;
	}

	public static void printPlayers(ArrayList<Player> playersList){
		System.out.println("Name         Runs        Matches");
		for(Player player: playersList)
			System.out.println(player.getName() + "        " + player.getRuns() + "          " + player.getMatches());
	}
	
	public static int rank(int key, int[] a){
		return rank(key,a, 0, a.length-1);
	}
	
	public static int depth = 0;
	public static int rank(int key, int[] a, int lo, int hi){
		depth++;
		System.out.println(depth + "   " + lo + "   " + hi);
		if(lo>hi) return -1;
		int mid = lo +(hi-lo)/2;
		if (key<a[mid]) return rank(key,a,lo,mid-1);
		else if(key>a[mid]) return rank(key,a,mid+1,hi);
		else if(key==a[mid])return mid;
		
		return 9999;
	}
	
	public static  Map<Integer, Double> h1 = new HashMap<>();
	public static int count = 0;
	public static double binomial(int N, int k, double p) {
		count++;
		if(h1.get(N)!=null) return h1.get(N);
		if ((N == 0) || (k < 0)) return 1.0;
		double value = (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
		h1.put(N,value);
		return value;
	}
	
}
