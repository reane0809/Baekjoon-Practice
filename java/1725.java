import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	private static int N;
	private static int[] stackHeight, stackPosition;
	private static int sp;
	private static int answer;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		int area;
		stackHeight = new int[N];
		stackPosition = new int[N];
		sp = 0;
		answer = 0;
		stackHeight[sp] = Integer.parseInt(in.readLine());
		stackPosition[sp] = 0;
		sp++;
		for (int i = 1 ; i < N ; i++) {
			int histogram = Integer.parseInt(in.readLine());
			int position = i;
			while (sp > 0 && stackHeight[sp - 1] > histogram) {
				sp--;
				area = stackHeight[sp] * (i - stackPosition[sp]);
				answer = (area > answer) ? area : answer;
				position = stackPosition[sp];
			}
			stackHeight[sp] = histogram;
			stackPosition[sp] = position;
			sp++;
		}
		while (sp > 0) {
			sp--;
			area = stackHeight[sp] * (N - stackPosition[sp]);
			answer = (area > answer) ? area : answer;
		}
		System.out.println(answer);
	}
}
