import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] tree = new int[N];
		
		int min = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			
			/*
			  나무들 중 최댓값 위해 매 입력마다 max 변수와 비교
			  입력 받은 나무가 max보다 클 경우 max 값을 해당 나무의 높이로 갱신해준다. 
			 */
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		// 이분 탐색 (upper bound)
		while(min < max) {
			
			int mid = (min + max) / 2;
			long sum = 0;
			for(int treeHeight : tree) {
				
				/*
				 tree의 잘린 길이 = tree의 높이 - 자르는 위치(mid)
				 tree의 잘린 길이 합을 구하기.
				 자르는 위치가 주어진 나무의 높이보다 클 수 있어서
				 0 이하인 경우(=음수)에는 합산을 하지 않고 양수만 합산하도록.
				 */
				if(treeHeight - mid > 0) { 
					sum += (treeHeight - mid);
				}
			}
			
 
			/*
			  자른 나무 길의의 합 < M은 자르는 위치(높이)가 높다는 의미이므로 높이를 낮춰야 함
			  =상한(max)를 줄이기
			 */
			if(sum < M) {
				max = mid;
			}
			
			/*
			  자른 나무 길이의 합 < M은 자르는 위치(높이)가 낮다는 뜻이므로 높이를 높여야 함
			  + 합=M 일 경우 최대한 적게 자르기 위해 자르는 높이를 높여야 하므로 하한(min)을 올려야 한다.
			 */
			else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
		
	}
}
