import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
        //1은 소수가 아니므로 2부터 시작
		//N이 계속 i로 나눠진 몫이 들어오므로 √N 보다 정수인 N이 처리하기 더 편함 따라서 i^2 
		for(int i = 2 ; i * i <= N ; i++) {
			while(N % i == 0) {
				sb.append(i).append("\n");
				N /= i;
			}
		}
		// N이 1인 경우 아무것도 출력하지 않음, 1이 아닌경우는 출력해야하므로, 위 공식에서 남은 1이아닌 나머지N을 출력
		if(N != 1) {
			sb.append(N);
		}
		System.out.println(sb);
    }
}

