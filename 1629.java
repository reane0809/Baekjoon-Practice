import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static long C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        System.out.println(calc(A, B));

    }
    public static long calc(long a, long b){ // (a^b) % C를 반환하는 메소드
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a % C;
        }
        else if(b % 2 == 0){
            long temp = calc(a, b/2);
            return ((temp % C) * (temp % C) % C);
        }
        else{
            return ((a % C) * calc(a, b - 1) % C) % C;
        }
    }
}

