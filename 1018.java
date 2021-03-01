import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static boolean[][] arr;
	public static int min= 64;
	
	public static void find(int x, int y) {
		int endN= x+8;
		int endM= y+8;
		int cnt=0;
		boolean b= arr[x][y];
		
		for(int i=x; i<endN; i++) {
			for(int k=y; k<endM; k++) {
				if(arr[i][k] != b) {//색이 틀린 경우
					cnt++;
				}
				b= !b;
			}
			b= !b;
		}
		
		cnt= Math.min(cnt, 64-cnt);
		min=Math.min(min, cnt);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		StringTokenizer st = new StringTokenizer(s);
        
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		arr= new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String str= br.readLine();
			for(int k=0; k<m; k++) {
				if(str.charAt(k) == 'B') {
					arr[i][k]= false;
				}
				else {
					arr[i][k]= true;
				}
			}
		}
		
		int rowN= n-7;
		int colM= m-7;
		for(int i=0; i<rowN; i++) {
			for(int k=0; k<colM; k++) {
				find(i, k);
			}
		}
		System.out.println(min);
		br.close();
		bw.flush();
//		bw.close();
	}
	
}
