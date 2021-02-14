import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		printPrimeNumbersBetweenMtoN(m, n);
	}
	
	
	private static void printPrimeNumbersBetweenMtoN(int m, int n) {
		boolean[] check = new boolean[n+1];
		
		check[0] = check[1] = true;
		
		for(int i=2; i<Math.sqrt(n); i++) {
			for(int j=i*i; j<=n; j+=i) {
				check[j] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=m; i<=n; i++) {
			if(!check[i])
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
