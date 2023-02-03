import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] board = new int[101];
        boolean[] visit = new boolean[101];

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            board[Integer.parseInt(input[0])] = Integer.parseInt(input[1]);
        }

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            board[Integer.parseInt(input[0])] = Integer.parseInt(input[1]);
        }

        Queue<Step> q = new LinkedList<>();
        q.offer(new Step(0, 1));
        visit[1] = true;
        while (!q.isEmpty()) {
            Step poll = q.poll();

            if (poll.position >= 100) {
                System.out.println(poll.step);
                break;
            }

            for (int i = 1; i <= 6; i++) {
                int pos = poll.position + i;
                if (pos > 100 || visit[pos]) {
                    continue;
                }
                visit[pos] = true;
                if (board[pos] != 0) {
                    pos = board[pos];
                    visit[pos] = true;
                }
                q.offer(new Step(poll.step + 1, pos));
            }
        }
    }

    static class Step {
        int step, position;

        public Step(int step, int position) {
            this.step = step;
            this.position = position;
        }
    }
}
