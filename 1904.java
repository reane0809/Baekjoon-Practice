import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		System.out.println(Tile(N));
 
	}
 
	public static int Tile(int n) {
         
		int num1 = 1;
		int num2 = 2;
		int sum = 0;
 
		if (n == 1) {
			return 1;
		} 
 
		if (n == 2) {
			return 2;
		}

		for (int i = 2; i < n; i++) {
			sum = (num2 + num1) % 15746;	// 이전 값과 이전의 이전 값의 합 
			num1 = num2;	// 이전의 이전 값은 이전 값으로 변경 
			num2 = sum;		// 이전 값은 현재 합 값으로 변경 
		}
 
		return sum;
	}
}

