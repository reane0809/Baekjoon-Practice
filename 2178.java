import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	static int N = 0;
	static int M = 0;

	static class Point{
		int pos_i;
		int pos_j;
		int length;
		
		Point(int i , int j,int length){
			this.pos_i = i;
			this.pos_j = j;
			this.length = length;
		}
		Point next = null;
	}
	static Point HEAD = null;
	static Point TAIL = null;
	
	static void enqueue(Point p){
		if(HEAD == null){
			HEAD = p;
			TAIL = p;
		}
		
		TAIL.next = p;
		TAIL = p;
	}
	static Point dequeue(){
		Point temp = HEAD;
		HEAD = HEAD.next;
		return temp;
	}
	
	static char [][] BOARD = new char[123][123];
	static boolean [][] VISITED = new boolean[123][123];
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm = br.readLine();
		String [] nmArr = nm.split(" ");
		N = Integer.parseInt(nmArr[0]);
		M = Integer.parseInt(nmArr[1]);
		
		for(int i = 1 ; i <= N ; i ++ ){
			String str = br.readLine();
			for(int j = 1 ; j <= M ; j ++ ){
				BOARD[i][j] = str.charAt(j-1); ; 
			}
		}
		
		int result = findAnswer();
		
		System.out.println(result);
	}
	
	//E,S,W,N
	static int [] DI = {1,0,0,-1}; 
	static int [] DJ = {0,1,-1,0};
	
	private static int findAnswer() {
		VISITED[1][1] = true;
		enqueue(new Point(1,1,1));
		
		while( HEAD != null ){
			
			Point current = dequeue();
			
			if(current.pos_i == N && current.pos_j == M ){
				return current.length;
			}
				
			for(int index =0; index < 4 ; index++){
				int nextI = current.pos_i +DI[index];
				int nextJ = current.pos_j +DJ[index];
				
				if( nextI > 0 && nextJ > 0 && nextI <= N && nextJ <=M ){
					if( BOARD[ nextI ][ nextJ ] == '1' && VISITED[nextI][nextJ]== false){
						VISITED[nextI][nextJ] = true;
						enqueue(new Point(nextI, nextJ, current.length+1));
					}
				}
			}
			
			
		}
		
		return -1;
	}
		
}
