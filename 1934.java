import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<N; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			sb.append(A*B/gcd(A,B)).append("\n");
			
		}
		
		System.out.println(sb);
		
	}
	
	static int gcd (int A, int B) {
		
		if(B==0) {
			
			return A;
			
		}
		
		return gcd(B, A%B);
		
	}

}
