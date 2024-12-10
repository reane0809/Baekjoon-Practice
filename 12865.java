import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int memo[];
	static int w[];
	static int v[];
	
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(stk.nextToken());
			int k = Integer.parseInt(stk.nextToken());
			
			w = new int[n+1];
			v = new int[n+1];
			memo = new int[k+1];
			
			for (int i = 1; i <= n; i++) {
				stk = new StringTokenizer(br.readLine());
				
				w[i] = Integer.parseInt(stk.nextToken());
				v[i] = Integer.parseInt(stk.nextToken());
			}
			
			for (int i = 1; i <= n; i++) {
				
				for (int j = k; j >= w[i]; --j) {
					memo[j] = Math.max(memo[j], memo[j-w[i]] + v[i]);
				}
			}
			
			System.out.println(memo[k]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

