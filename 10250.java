import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            if (N%H != 0) {
                int hosu = ((N / H) + 1);
                int count = (N % H) * 100;
                System.out.println(hosu + count);
            }else{
               int hosu = (N/H);
               int count = H*100;
                System.out.println(hosu+count);
            }
        }
    }
}

