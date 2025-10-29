import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int powOf2 = 1;
        while (powOf2 < N) {
            powOf2 = powOf2 << 1;
        }
        if (N < powOf2) {
            powOf2 = powOf2 >> 1;
        }

        int answer = N == powOf2 ? N : 2 * (N-powOf2);
        System.out.println(answer);
        br.close();
    }
}

