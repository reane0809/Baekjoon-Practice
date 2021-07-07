import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] cost;
	static int[]	dp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		cost = new int[N+1][2];
		dp = new int[N+1];
		
		for(int n =1; n<=N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			cost[n][0]	= a;
			cost[n][1]	= b;
		}
		
		Arrays.sort( cost, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] < o2[0])	return -1;
				if(o1[0] > o2[0])	return 1;
				return 0;
			}
			
		});
		
		dp[1] = 1;
		for(int i=2; i<=N; i++) {   // LIS
			dp[i] = 1;
			for(int j=1;j<i; j++) {
				if(cost[i][1]>cost[j][1]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
					int aa=0;
					aa=1;
				}
			}
		}
		
		int max= Integer.MIN_VALUE;
		for(int j=1; j<=N; j++) {
			if(dp[j] > max) {
				max = dp[j];
			}
		}
		
		bw.write(String.valueOf(N-max) + '\n');
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
