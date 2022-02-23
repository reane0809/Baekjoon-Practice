import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		int[] dice = new int[6];
		dice[Integer.parseInt(token.nextToken())-1]++;
		dice[Integer.parseInt(token.nextToken())-1]++;
		dice[Integer.parseInt(token.nextToken())-1]++;
		
		int max = 0;
		int result = 0;
		for(int i=0; i<6; i++) {
			if(dice[i] == 3) {
				result = ( 10000+(i+1)*1000 );
				break;
			}
			if(dice[i] == 2) {
				result = ( 1000+(i+1)*100 );
				break;
			}
			if(dice[i] == 1) max = i+1;
		}
		System.out.print( result > 0 ? result : max*100 );
	}
}
