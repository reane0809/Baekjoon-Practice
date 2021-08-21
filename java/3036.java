import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n; i++) {
			int b = Integer.parseInt(st.nextToken());
			int gcd = a > b ? euclidean(b, a) : euclidean(a, b);
			sb.append(a/gcd).append("/").append(b/gcd).append(System.lineSeparator());
		}
		
		System.out.print(sb.toString());
	}

    public static int euclidean(int n, int m) {
    	// m > n
    	if(n == 0) {
    		return m;
    	}
    	return euclidean(m%n, n);
    	
    }
}
