import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        Queue<int[]> Q = new PriorityQueue<>((x, y) -> {
            if (x[1] == y[1])
                return x[0] - y[0];
            return x[1] - y[1];
        });
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Q.offer(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
        }

        int cnt = 0;
        int end = 0;
        while (!Q.isEmpty()) {
            int[] T = Q.poll();
            if (end > T[0])
                continue;
            cnt++;
            end = T[1];
        }
        System.out.println(cnt);
    }
}

