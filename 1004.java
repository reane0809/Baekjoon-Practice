import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X1 = Integer.parseInt(st.nextToken()), Y1 = Integer.parseInt(st.nextToken()), X2 = Integer.parseInt(st.nextToken()), Y2 = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(br.readLine());

			int a = 0;
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken()), Y = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
				int d = R * R;
				int d1 = (X1 - X) * (X1 - X) + (Y1 - Y) * (Y1 - Y);
				int d2 = (X2 - X) * (X2 - X) + (Y2 - Y) * (Y2 - Y);

				if(d1 < d && d2 > d || d1 > d && d2 < d)	a++;
			}

			sb.append(a + "\n");
		}
		System.out.print(sb.toString());
	}
}
