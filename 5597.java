import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    private void solve() {
        class Node {
            int front;
            int back;

            Node(int front, int back) {
                this.front = front;
                this.back = back;
            }
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            boolean[] homework = new boolean[30];

            for (int i = 0; i < 28; ++i) {
                int num = Integer.parseInt(br.readLine());
                homework[num - 1] = true;
            }

            for (int i = 0; i < 30; ++i) {
                if(!homework[i])
                    System.out.println(i + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
