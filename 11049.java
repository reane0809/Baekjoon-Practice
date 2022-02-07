import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[] d;			// 행열의 행, 열의 개수 (1번 행렬의 행의 수: d[0], 열의 수: d[1])
	
	public static void main(String[] args) throws Exception {
		input();
		System.out.println(solve());
	}
	
	public static int solve() {
		int[][] M = new int[N+1][N+1];

		for (int len = 1; len < N; len++) {
	        for (int i = 1; i <= N-len; i++) {
	            int j = i + len;
	            M[i][j] = Integer.MAX_VALUE;
	            
	            for (int k = i; k < j; k++) {
	                int cost = M[i][k] + M[k + 1][j] + d[i-1] * d[k] * d[j];
	                M[i][j] = Math.min(M[i][j], cost);
	            }
	        }
	    }
		
		return M[1][N];
	}

	public static void input() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		d = new int[N+1];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			d[i] = Integer.parseInt(st.nextToken());
			d[i+1] = Integer.parseInt(st.nextToken());
		}
	}
}
