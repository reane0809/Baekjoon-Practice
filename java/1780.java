import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int[][] arr;
	private static int[] num = new int[3];	// -1, 0 ,1
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		arr = new int[N][N];
		
		for(int i=0 ; i<N ; i++){
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for(int j=0 ; j<N ; j++){
				arr[i][j] = Integer.parseInt(tokenizer.nextToken());
			}
		}
		
		cut(N, 0, 0);
		
		for(int i=0 ; i<3 ; i++)
			System.out.println(num[i]);
	}
	
	public static boolean equal(int size, int startX, int startY){
		int target = arr[startY][startX];
		
		for(int i=startY ; i<startY+size ; i++){
			for(int j=startX ; j<startX+size ; j++){
				if(target != arr[i][j]){
					return false;
				}
			}
		}
		
		num[target+1]++;
		return true;
	}
	
	public static void cut(int size, int startX, int startY){
		if(equal(size, startX, startY))
			return;
		
		for(int i=0 ; i<3 ; i++)
			for(int j=0 ; j<3 ; j++)
				cut(size/3, startX + j*(size/3), startY + i*(size/3));
	}
}
