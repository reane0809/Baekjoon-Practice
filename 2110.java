import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int N, C;
	public static int[] X = new int[200002];

	public static void main(String[] args) throws IOException {
//		System.setIn(new FileInputStream("sample_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		for(int i=1;i<=N;i++) X[i] = Integer.parseInt(br.readLine());
		// input end
		
		Arrays.sort(X,1,N+1);
		System.out.println(parametricSearch());
	}
	
	public static int parametricSearch(){
		int low = 0;
		int high = (int)1e9;
		int ans = -1;
		
		while(low <= high){
			int mid = (low+high)/2;
			
			if(isAnswer(mid)){
				ans = mid;
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		
		return ans;
	}
	
	public static boolean isAnswer(int d){
		int prev_x = X[1];
		int cnt = 1;
		
		for(int i=2;i<=N;i++){
			if(X[i]-prev_x >= d){
				prev_x = X[i];
				cnt++;
			}
		}
		
		if(cnt >= C) return true;
		else return false;
	}

}
