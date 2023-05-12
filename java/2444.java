import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	private BufferedReader br;
	private BufferedWriter bw;
	private StringBuilder space;
	private StringBuilder[] rows;
	private int n;
	private int nRow;

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.start();
	}

	private void start() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		space = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		nRow = 2 * n - 1;
		rows = new StringBuilder[nRow + 1];

		for (int i = 1; i <= nRow; i++) {
			rows[i] = new StringBuilder();
		}

		for (int i = n; i >= 1; i--) {

			rows[i].append(space.toString());
			space.append(" ");

			for (int j = 0; j < (2 * i - 1); j++) {
				rows[i].append("*");
			}

			if(i < n) {
				rows[nRow - (i - 1)].append(rows[i].toString());
			}
		}

		for (int i = 1; i <= nRow; i++) {
			bw.write(rows[i].toString());
			if ((i + 1) < rows.length) {
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
