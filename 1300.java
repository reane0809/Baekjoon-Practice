import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
	static int N;
	static int K;

	public static void main(String[] args) throws Exception {
		
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		N = Integer.parseInt(reader.readLine());
		K = Integer.parseInt(reader.readLine());
		
		int Answer = solve();
		
		writer.println(Answer);
		
		writer.close();
		reader.close();
	}

	private static int solve() {
		int low = 1;
		int high = K;
		int middle = 0;
		
		while (low < high) {
			middle = (low + high) / 2;
			
			int count = howMany(middle);
			
			if (count < K)
				low = middle + 1;
			else 
				high = middle;			
		}
		
		return low;
	}
	
	// x 이하의 값을 가진 갯수가 몇갠지
	private static int howMany(int x) {
		int count = 0;

		// i행에서 x 이하의 갯수
		for (int i = 1; i <= N; i++)
			count += Math.min(x / i, N);
		
		return count;		
	}

}
