import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static long count;
	private static long[] sums = new long[1_001];

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] sum = new int[N];
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++) {
			int A = Integer.parseInt(st.nextToken());

			if(i == 0) sum[i] = A % M;
			else sum[i] = (sum[i - 1] % M + A % M) % M;

			if(sum[i] == 0) count++;
			sums[sum[i]]++;
		}

		section(M);
		System.out.println(count);
	}
	
	private static void section(int n) {
		for(int i = 0; i < n; i++) {
			count += sums[i] * (sums[i] - 1) / 2;
		}
	}
}
