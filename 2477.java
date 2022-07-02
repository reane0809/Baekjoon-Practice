import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()); // 밭에서 자라는 참외 수
		int[] direction = new int[6];
		int[] distance = new int[6];
		int result = 0;
		int width = 0;
		int height = 0;
		
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			direction[i] = Integer.parseInt(st.nextToken());
			distance[i] = Integer.parseInt(st.nextToken());
			
			// 가로, 세로 가장 긴 값 찾기
			if(direction[i] == 1) width += distance[i];
			else if(direction[i] == 4) height += distance[i];
		}
		

		result = width * height; // 빈 곳을 합친 전체 넓이
		
		int a = 0;
		int b = 0;
		for(int i = 0; i < 6; i++) {
			// 빈 사각형의 높이 
			if(distance[i] == width && a == 0) {
				a = Math.abs(distance[(i+1)%6]-distance[(i-1+6)%6]);
			// 빈 사각형의 너비
			}else if(distance[i] == height) {
				b = Math.abs(distance[(i+1)%6]-distance[(i-1+6)%6]);
			}
		}
		
		// 전체 넓이에서 빈 사각형 빼기 
		result -= a*b;
		

		System.out.println(result*n);
	}
}
