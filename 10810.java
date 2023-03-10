import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt( token.nextToken() );
		int m = Integer.parseInt( token.nextToken() );
		int[] basket = new int[n];
		for(int i=0; i<m; i++) {
			token = new StringTokenizer(br.readLine());
			int from = Integer.parseInt( token.nextToken() )-1;
			int to = Integer.parseInt( token.nextToken() )-1;
			int num = Integer.parseInt( token.nextToken() );
			for(int j=from; j<=to; j++) {
				basket[j] = num;
			}
		}
		for(int i=0; i<n; i++) System.out.print(basket[i] + " ");
	}
}
