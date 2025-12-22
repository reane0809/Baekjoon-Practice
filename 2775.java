import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static final String SPACE = " ";
	public static final String NEW_LINE = "\n";

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());

			int[][] apart = new int[a + 1][b + 1];

			for (int j = 0; j <= a; j++) {
				apart[j][1] = 1;
			}

			for (int k = 1; k <= b; k++) {
				apart[0][k] = k;
			}

			for (int j = 1; j <= a; j++) {
				for (int k = 1; k <= b; k++) {
					apart[j][k] = apart[j - 1][k] + apart[j][k - 1];
				}
			}
			sb.append(apart[a][b]).append(NEW_LINE);
		}
		System.out.println(sb.toString());
	}
}

