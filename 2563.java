import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s;
        boolean[][] map = new boolean[100][101];
        int a, b;
        for(int i=0;i<N;i++) {
            s = br.readLine().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
            for(int j=a;j<a+10;j++)
                for(int k=b;k<b+10;k++)
                    map[j][k] = true;
        }
        int sum = 0;
        for(int i=0;i<100;i++)
            for(int j=0;j<100;j++)
                if(map[i][j])
                    sum++;
        System.out.println(sum);
    }
}
