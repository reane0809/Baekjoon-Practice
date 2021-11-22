import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static final int N = 10000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countOfSanggeunCard = Integer.parseInt(br.readLine());
		int[] sanggeunCard = new int[20000001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < countOfSanggeunCard; i++) {
			sanggeunCard[Integer.parseInt(st.nextToken()) + N] += 1;
		}
		
		int testCase = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while (testCase-- > 0) {
			int checkCard = Integer.parseInt(st.nextToken()) + N;
			sb.append(sanggeunCard[checkCard]).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}
