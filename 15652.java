import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	static int arr[];
	static boolean visit[];
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visit = new boolean[N];
		NM(N,M,0,0);
		System.out.print(sb);
	}
	
	public static void NM(int n, int m, int depth, int value) {
		if(depth == m) {
			for(int x: arr) {
				sb.append(x).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i = value; i < n; i++) {
			  arr[depth] = i+1;
			  NM(n,m,depth+1, i);
		}
	}
}

