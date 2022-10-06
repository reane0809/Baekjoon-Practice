import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));
		// Stack<Character> stack = new Stack<Character>();

		char[] base = bf.readLine().toCharArray();
		char[] bomb = bf.readLine().toCharArray();
		char[] ans = new char[base.length];

		StringBuilder sb = new StringBuilder();

		int bomLen = bomb.length;
		int baseLen = base.length;

		char c = bomb[bomLen - 1];
		int aIndex = 0;

		for (int i = 0; i < baseLen; i++) {
			// 폭탄
			boolean flag = false;
			ans[i - aIndex] = base[i];

			if (base[i] == c) {
				flag = true;
				for (int j = 0; j < bomLen - 1; j++) {
					if (i - aIndex - j - 1 >= 0
							&& ans[i - aIndex - j - 1] == bomb[bomLen - 2 - j]) {

					} else {
						flag = false;
						break;
					}
				}
			}

			// 폭탄이 맞으면
			if (flag) {
				aIndex += bomLen;
			}
		}

		if (aIndex == baseLen) {
			bw.write("FRULA");
		} else {
			String result = new String(ans, 0, baseLen - aIndex);
			bw.write(result);
		}

		bw.flush();
		bw.close();
		bf.close();
	}
}
