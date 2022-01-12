import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        PriorityQueue<AbsInteger> minAbsHeap = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value == 0) {
                if (minAbsHeap.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(minAbsHeap.poll().value).append("\n");
                }
            } else {
                minAbsHeap.add(new AbsInteger(value));
            }
        }

        System.out.println(sb.toString());
    }
}

class AbsInteger implements Comparable<AbsInteger> {
    int value;
    int abs;

    public AbsInteger(int value) {
        this.value = value;
        this.abs = Math.abs(value);
    }

    @Override
    public int compareTo(AbsInteger o) {
        if (this.abs == o.abs) {
            return this.value - o.value;
        }
        return this.abs - o.abs;
    }
}
