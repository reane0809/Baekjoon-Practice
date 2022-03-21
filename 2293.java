import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int goal;
	static int[] coin;
	static int[] dp; 

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		goal = Integer.parseInt(st.nextToken());
		coin = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			coin[i] = Integer.parseInt(st.nextToken());
		}
		dp = new int[goal + 1];
		dp[0] = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = coin[i]; j <= goal; j++) {
				dp[j] += dp[ j - coin[i]];
			}
		}
		System.out.println(dp[goal]);
	}
}
