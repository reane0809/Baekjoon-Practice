import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] N = br.readLine().split("");
		int[] array = new int[N.length];
		int cnt = 0;

		for (int i = 0; i < N.length; i++) {
			array[i] = N[i].charAt(0) - 65;
			if (array[i] >= 0 && array[i] < 3)
				cnt += 3;
			else if (array[i] >= 3 && array[i] < 6)
				cnt += 4;
			else if (array[i] >= 6 && array[i] < 9)
				cnt += 5;
			else if (array[i] >= 9 && array[i] < 12)
				cnt += 6;
			else if (array[i] >= 12 && array[i] < 15)
				cnt += 7;
			else if (array[i] >= 15 && array[i] < 19)
				cnt += 8;
			else if (array[i] >= 19 && array[i] < 22)
				cnt += 9;
			else if (array[i] >= 22 && array[i] <= 25)
				cnt += 10;
		}
		System.out.print(cnt);
	}
}
