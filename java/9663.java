import java.util.Scanner;

public class Main {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		boolean[] check_line = new boolean[n];
		boolean[] check_diag1 = new boolean[2*n-1];
		boolean[] check_diag2 = new boolean[2*n-1];
		int[] pos = new int[n];
		
		set(n,0, check_line, check_diag1, check_diag2, pos);
		System.out.println(count);
	}
	
	static void set(int n, int i, boolean[] a, boolean[] b, boolean[] c, int[] x) {
		
		
		
		for(int j=0; j<n; j++) {
			if (a[j] == false &&
				b[i+j] == false &&
				c[i-j+n-1] == false) {
				
				x[i]=j;
				
				if(i==n-1) count++; 
				
				else {
					a[j] = b[i+j] = c[i-j+n-1] = true;
					set(n, i+1, a, b, c, x);
					a[j] = b[i+j] = c[i-j+n-1] = false;
				}
			}
		}
	}
}
