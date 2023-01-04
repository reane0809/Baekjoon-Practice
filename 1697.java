import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int result = dfs(N,K);
        System.out.println(result);
    }

    private static int dfs(int n, int k) {
        if (n >= k)
            return n - k;
        else if (k == 1)
            return 1;
        else if (k%2 == 1)
            return Math.min(dfs(n, k - 1), dfs(n, k + 1)) + 1;
        else
            return Math.min(k - n, dfs(n, k / 2) + 1);
    }
}
