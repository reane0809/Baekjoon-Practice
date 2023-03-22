import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer( br.readLine() );

		int n = Integer.parseInt( token.nextToken() );
		int m = Integer.parseInt( token.nextToken() );
		int[] basket = new int[n];
		for(int i=0; i<n; i++) {
			basket[i] = i+1;
		}
		
		for ( int i = 0; i < m; i++ ) {
			token = new StringTokenizer( br.readLine() );
			int start = Integer.parseInt( token.nextToken() ) - 1;
			int end = Integer.parseInt( token.nextToken() ) - 1;
			
			int temp = basket[end];
			basket[end] = basket[start];
			basket[start] = temp;
		}
		for ( int i = 0; i < n; i++ )
			System.out.print( basket[i] + " " );

	}
}
