import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static HashMap<String, Boolean> data = new HashMap<String, Boolean>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int result=0;
		for(int i=0; i<N; i++) {
			data.put(br.readLine(), true);
		}
		
		for(int i=0; i<M; i++) {
			if(data.get(br.readLine()) != null)
				result++;
		} 
		
		System.out.println(result);
	}
}
