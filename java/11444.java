import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		long [][] ans = { { 1, 0 }, { 0 , 1} };
		long [][] a = { { 1, 1 }, { 1, 0 } };
		
		
		while(n > 0) {
			if( n % 2 == 1) {
				ans = multiple(ans, a);
			}
			a = multiple(a, a);
			n /= 2;
		}
		
		System.out.println(ans[0][1]);
	}
	
	public static long [][] multiple(long [][] a , long [][] b) {
		
		int n = a.length;
		long [][] c = new long [n][n];
		for(int i = 0; i < n; ++i ) {
			for(int j = 0; j < n; ++j) {
				for(int k = 0; k < n; ++k) {
					c[i][j] += a[i][k] * b [k][j];
				}
				c[i][j] %= 1000000007;
			}
		}
		
		return c;
	}
}
