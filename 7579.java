import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
		main.solve();
	}

	private int m;
	private int n;
	private int[] dp;
	private int[] mem;
	private int[] reExec;

	private void solve() {
		for (int i = 1; i <= n; ++i) {
			for (int j = 10000; j >= reExec[i]; --j) {
				dp[j] = Math.max(dp[j], dp[j-reExec[i]] + mem[i]);
			}
		}
		
		for (int i = 0; i <= 10000; ++i) {
			if (dp[i] >= m) {
				System.out.println(i);
				break;
			}
		}
	}

	private void init() {
		/*
		 * Get input started..
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			n = Integer.parseInt(st.nextToken(), 10);
			m = Integer.parseInt(st.nextToken(), 10);
			dp = new int[10001];
			mem = new int[n+1];
			reExec = new int[n+1];
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 1; i <= n; ++i) {
				mem[i] = Integer.parseInt(st.nextToken(), 10);
			}
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 1; i <= n; ++i) {
				reExec[i] = Integer.parseInt(st.nextToken(), 10);
			}
			
			dp[reExec[0]] = mem[0];
			dp[0] = 0;

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * Get input ended..
		 */
	}
	
}
