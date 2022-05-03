import java.io.*;
import java.util.Arrays;

public class Main {
    private static int num;
    private static int[][] map;
    private static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n+2][n+2];
        for (int i = 1; i <= n; ++i) {
            char[] t = br.readLine().toCharArray();
            for (int j = 1; j <= n; ++j) {
                map[i][j] = t[j-1]-'0';
            }
        }
        br.close();
        num = 2;

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (map[i][j] == 1) {
                    dfs(i, j);
                    ++num;
                }
            }
        }
        int[] nums = new int[num];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (map[i][j] !=  0) {
                    ++nums[map[i][j]-2];
                }
            }
        }
        Arrays.sort(nums);
        num = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[num++] = nums[i];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num));
        bw.newLine();
        for (int i = 0; i < num; ++i) {
            bw.write(String.valueOf(nums[i]));
            bw.newLine();
        }
        bw.close();
    }

    private static void dfs(int i, int j) {
        map[i][j] = num;
        if (map[i+1][j] == 1)
            dfs(i+1, j);
        if (map[i-1][j] == 1)
            dfs(i-1, j);
        if (map[i][j+1] == 1)
            dfs(i, j+1);
        if (map[i][j-1] == 1)
            dfs(i, j-1);
    }
}
