import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int arr[]; //각 자리의 수를 저장하기 위한 배열	
	static int sum; //i 번째 값으로 끝나는 연속된 구간의 최대 합
	static int DP[]; //1 ~ i 구간의 최대 부분합을 저장하고 있는 값
		
	public static void main(String[] args) throws Exception {
		int d = -1;
		int N = Integer.parseInt(br.readLine());
		//배열 초기화
		arr = new int[N+1]; //입력값을 받기 위한 N개의 배열 선언 
		DP = new int[N+1]; //1 ~ i 구간의 최대 부분합을 저장하고 있는 값
		
		sum = -100000; //Integer.MIN_VALUE로 넣게 되면 처음에 음수가 나올 경우 범위 밖을 벗어나서 오류가 생김
		DP[0] = -100000; 
		
		//N개의 수를 배열에 저장
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) arr[i] = Integer.parseInt(st.nextToken());
				
		for (int i=1; i<=N; i++) {
            
			sum = Math.max(sum + arr[i], arr[i]);
			DP[i] = Math.max(DP[i-1], sum);
		}
		
		System.out.println(DP[N]);
	}
}
