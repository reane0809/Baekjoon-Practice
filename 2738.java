import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int n;
    static int m;
    static StringBuilder sb;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++){ // 처음 N X M 행렬 입력받아서 배열에
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){ // 두번째 N X M 행렬 입력받을 시
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                a[i][j] += Integer.parseInt(st.nextToken()); // 첫 행렬 같은 성분에 더하고
                sb.append(a[i][j]).append(" "); // 더한 값을 StringBuilder 객체에 입력.
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
