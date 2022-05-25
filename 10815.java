import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception {

        Set<Integer> treeSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int N = read();

        for (int i = 0; i < N; i++) {
            treeSet.add(read());
        }

        int M = read();

        for (int i = 0; i < M; i++) {
            int number = read();
            if (treeSet.contains(number)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }

    private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if (isNegative) n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return isNegative ? ~n + 1 : n;
    }
}
