import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long input = Long.parseLong(st.nextToken());
        long base = 1;
        long result = 0;
        for(; ; result++){
            if(base+6*result>=input)break;
            else base += 6*result;
        }
        System.out.println(result+1);
    }
}
