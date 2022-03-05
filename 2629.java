import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static int weight[];
	static int marble[];
	static boolean memo[][];
	static boolean we[];
	static int N;
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine().trim());
		weight = new int[N+1];

		StringTokenizer s = new StringTokenizer(in.readLine()," ");
		for (int i = 0; i < N; i++) 
			weight[i] = Integer.parseInt(s.nextToken());
		
		int M = Integer.parseInt(in.readLine().trim());
		marble = new int[M];

		s = new StringTokenizer(in.readLine()," ");
		for (int i = 0; i < M; i++) 
			marble[i] = Integer.parseInt(s.nextToken());
		
		memo = new boolean[N+1][500*30+1];
		we = new boolean[500*30+1];
		DFS(0,0);
		
		for (int i = 0; i < M; i++) {
			if(marble[i] <= 15000 && we[marble[i]])
				System.out.print("Y"+" ");
			else
				System.out.print("N"+" ");
		}
	}
	private static void DFS(int cnt,int val) {
		if(cnt > N) //이미 있는 값이면 return
			return;
		if(memo[cnt][val])
			return;
		memo[cnt][val] = true;
		we[val] = true;
		DFS(cnt+1,val+weight[cnt]);
		DFS(cnt+1,val);
		DFS(cnt+1,Math.abs(weight[cnt]-val));
	}
}
