import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static boolean[][] a;
	private static int bluecnt;
	private static int whitecnt;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = in.read() - '0';
		for (int t = in.read(); t != '\n'; t = in.read()) {
			n = n * 10 + t - '0';
		}
		a = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.read() == '1' ? true : false;
				in.read();
			}
		}
		bluecnt = 0;
		whitecnt = 0;
		cpaper(0, 0, n);
		System.out.print(whitecnt + "\n" + bluecnt);
	}

	private static int cpaper(int i, int j, int size) {
		if ((i == i + size - 1) && (j == j + size - 1)) {
			if (a[i][j]) {
				bluecnt++;
				return 1;
			} else {
				whitecnt++;
				return 0;
			}
		}
		size >>>= 1;
		// 왼쪽 위 , 오른쪽위, 왼쪽아래, 오른쪽아래
		int res = cpaper(i, j, size) + cpaper(i, j + size, size) + cpaper(i + size, j, size)
				+ cpaper(i + size, j + size, size);
		if (res == 4) {
			bluecnt -= 3;
			return 1;
		} else if (res == 0) {
			whitecnt -= 3;
			return 0;
		} else
			return 10;
	}
}
