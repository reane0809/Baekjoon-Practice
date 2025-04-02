import java.io.*;

public class Main {
	public static Integer[] dp;

	public static int makeOne(int n, int count) {
		if (n < 2) {
			return count;
		}
		return Math.min(makeOne(n / 2, count + 1 + (n % 2)), makeOne(n / 3, count + 1 + (n % 3)));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		System.out.println(makeOne(n, 0));

	}
}

