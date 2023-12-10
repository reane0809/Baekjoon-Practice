import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException, NullPointerException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int count = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = x; i <= y; i++) {
			if (isPrimeNum(i)) {
				sum += i;
				if (min > i)
					min = i;
			}
		

		}
		sb.append(sum).append("\n").append(min).append("\n");
		System.out.println(sum == 0 ? -1 : sb);

	}

	public static boolean isPrimeNum(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
