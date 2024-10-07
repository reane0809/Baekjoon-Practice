import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int R = 0, G = 0, B = 0;
        int r, g, b, dpR, dpG, dpB;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            dpR = Math.min(r + G, r + B);
            dpG = Math.min(g + R, g + B);
            dpB = Math.min(b + R, b + G);

            R = dpR;
            G = dpG;
            B = dpB;
        }
        int answer = Math.min(R,G);
        answer = Math.min(answer,B);
        System.out.println(answer);
    }
}

