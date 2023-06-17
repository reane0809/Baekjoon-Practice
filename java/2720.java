import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	final static int[] coins = {25, 10, 5, 1};
	static int[] coinCnt = new int[4];
	
	static int T;
	static int C;
	
	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(bf.readLine());
		
		for(int t = 1; t <= T; t++) {
			C = Integer.parseInt(bf.readLine());
			Arrays.fill(coinCnt, 0);
			
			for(int i = 0; i < coins.length; i++) {
				coinCnt[i] = C / coins[i];
				C %= coins[i];
			}
			
			for(int i = 0; i < coinCnt.length; i++)
				sb.append(coinCnt[i]).append(" ");
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
