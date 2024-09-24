import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] a = new int[N];
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(tokenizer.nextToken());
		}
		int[] d = new int[N];
		int[] d2 = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = 1;
			d2[i] = 1;
			for (int j = i-1; j >= 0; j--) {
				if(a[i]>a[j] && d[i]<d[j]+1)
					d[i]=d[j]+1;
			}
		}
		 for (int i=N-1; i>=0; i--) {
	            d2[i] = 1;
	            for (int j=i+1; j<N; j++) {
	                if (a[i] > a[j] && d2[j]+1 > d2[i]) {
	                    d2[i] = d2[j]+1;
	                }
	            }
	        }
		int max = -1;
		for (int i = 0; i < N; i++) {
			if (max < d[i]+d2[i]-1)
				max =d[i]+d2[i]-1;
		}
		System.out.println(max);
	}
}

