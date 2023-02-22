import java.util.*;
import java.io.*;
public class Main{
    static int N;
    static int K;
    static final int MAX = 100001;
    
    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        st = new StringTokenizer(br.readLine());
        N = Integer.valueOf(st.nextToken());
        K = Integer.valueOf(st.nextToken());
        
        int[] dp = new int[K+1];
        Arrays.fill(dp, MAX);
        
        for(int i=0;i<=K;i++){
            if(i <= N){
                dp[i] = N - i;
            }else {
                int a = dp[i-1]+1;
                if(i%2 == 0){
                    int b = (i/2 > 0 ? dp[i/2] : MAX);
                    dp[i] = Math.min(a, b);
                }else{
                    int b = ((i-1)/2 > 0 ? dp[(i-1)/2]+1 : MAX);
                    int c = ((i+1)/2 > 0 ? dp[(i+1)/2]+1 : MAX);
                    b = Math.min(a,b);
                    dp[i] = Math.min(b,c);
                }
            }
        }
        System.out.println(dp[K]);
    }
}
