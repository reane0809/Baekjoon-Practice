import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, K, min;
	static int[] coin;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		coin = new int[N];
		for(int i = 0; i < N; i++) coin[i] = Integer.parseInt(br.readLine());

		for(int i = N-1; i >= 0; i--) {
			if(K >= coin[i]) {
				min += K/coin[i];
				K %= coin[i];
			}
		}

		System.out.print(min);
	}
}
