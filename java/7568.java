import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int weight[] = new int[N], height[] = new int[N];
        int rank;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            rank = 1;
            for(int j = 0; j < N; j++){
                if(weight[i] < weight[j] && height[i] < height[j]) rank += 1;
            };
            sb.append(rank).append(" ");
        }
        System.out.print(sb);
    }
}
