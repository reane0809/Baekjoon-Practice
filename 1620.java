import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int MAX_N = 100001;
	static int N, M;
	static String[] MON = new String[MAX_N];
	static Map<String, Integer> MAP = new HashMap<String, Integer>();

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		for(int idx = 1; idx <= N; idx++) {
			MON[idx] = in.readLine();
			MAP.put(MON[idx], idx);
		}
		StringBuilder sb = new StringBuilder();
		for(int idx = 0; idx < M; idx++) {
			String line = in.readLine();
			if(line.charAt(0) >= 'A' && line.charAt(0) <= 'Z') {
				sb.append(MAP.get(line)).append("\n");
			} else {
				sb.append(MON[Integer.parseInt(line)]).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}

