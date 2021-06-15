import java.util.*;
import java.io.*;

public class Main{
	static int N, f[][];
	static long ans;
	public static void main(String args[]) {
        
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int mod = 1000000000;
		f = new int[N+1][10];
        
		for(int i=1;i<10;i++) {
			f[1][i]=1;
		}
		for(int i=2;i<=N;i++) {
			for(int j=0;j<10;j++) {
				if(j>0) f[i][j]+=f[i-1][j-1];
				if(j<9) f[i][j]+=f[i-1][j+1];
				f[i][j]%=mod;
			}
		}
		for(int i=0;i<10;i++) {
			ans+=f[N][i]%mod;
		}
		ans%=mod;
		System.out.println(ans);
	}
}
