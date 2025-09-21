import java.io.*;
import java.util.*;

public class Main {

	static long N, M, Answer;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			StringTokenizer st = new StringTokenizer(br.readLine());
			Answer = 0;
			
			long cnt5 = 0;
			long cnt2 = 0;
			
			N = Long.parseLong(st.nextToken());
			M = Long.parseLong(st.nextToken());

			// N!이 인수로 가지고 있는 5의 개수
			for (long i = 5; i <= N; i *= 5) {
				cnt5 += N / i;
			}
			
			// (N-M)! 이 인수로 가지고 있는 5의 개수
			for (long i = 5; i <= N-M; i *= 5) {
				cnt5 -= (N-M) / i;
			}
			
			// M! 이 인수로 가지고 있는 5의 개수
			for (long i = 5; i <= M; i *= 5) {
				cnt5 -= M / i;
			}
			
			// N! 이 인수로 가지고 있는 2의 개수
			for (long i = 2; i <= N; i *= 2) {
				cnt2 += N / i;
			}
			
			// (N-M)! 이 인수로 가지고 있는 2의 개수
			for (long i = 2; i <= N-M; i *= 2) {
				cnt2 -= (N-M) / i;
			}
			
			// M! 이 인수로 가지고 있는 2의 개수
			for (long i = 2; i <= M; i *= 2) {
				cnt2 -= M / i;
			}
			
			Answer = Math.min(cnt2, cnt5);
			
			System.out.println(Answer);
		}

}

