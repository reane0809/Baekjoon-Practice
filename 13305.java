import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] D = new int[N-1];
		int[] C = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N-1; i++) D[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) C[i] = Integer.parseInt(st.nextToken());
		long answer = 0l;
		for(int i=0; i<N-1; i++){
		    int dist = 0, cnt = 1;
		    dist += D[i];
		    while(i+cnt<N-1 && C[i]<=C[i+cnt]){
		        dist += D[i+cnt];
		        cnt++;
		    }
		    answer += 1l*C[i]*dist;
		    i += cnt-1;
		}
		System.out.println(answer);
		br.close();
	}
}

