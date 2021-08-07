import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		int N = read();
		int [] arr = new int[N-1];
		int pre = read();
		for(int i = 0; i < N-1; i++) {
			int cur = read();
			arr[i] = pre-cur < 0 ? (pre-cur)*-1 : pre-cur;
			pre = cur;
		}

		int x = arr[0];
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 1; i < N-1; i++) x = gcd(x, arr[i]);
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(i*i==x) al.add(i);
		    else if(x % i==0) {
		    	al.add(i);
		    	al.add(x/i);
		    }
		}
		Collections.sort(al);
		for(int v: al) sb.append(v).append(' ');
		sb.append(x);
		System.out.print(sb);
	}
	
	static int gcd(int x, int y) {
		int r;
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
	
	private static int read() throws Exception {
	     int c, n = System.in.read() & 15;
	     while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
	     return n;
	}
}
