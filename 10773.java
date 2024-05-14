import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] stack = new int[N];
		int top = -1;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a == 0) {
				int b = stack[top--];
				sum -= b;
			} else {
				stack[++top] = a;
				sum += a;
			}
		}
		
		System.out.println(sum);
	}

}
