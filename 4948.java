import java.util.*;
import java.io.*;

public class Main{
	
	public static boolean[] prime;
	public static int check_prime(int a) {
		int count = 0;
		prime[0] = prime[1] = true;
		
		for(int i=2;i<Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j]=true;
			}
		}
		for(int i = a+1;i<prime.length;i++) {
			if(!prime[i]) count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = -1;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n==0) break;
			
			prime = new boolean[2*n+1];
			
			System.out.println(check_prime(n));
		}
	}
}
