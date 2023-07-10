import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.charAt(1) == 'u') {
                if (input.substring(0, 6).equals("push_f")) {
                    deque.offerFirst(Integer.parseInt(input.substring(11)));
                    continue;
                } else if (input.substring(0, 6).equals("push_b")) {
                    deque.offerLast(Integer.parseInt(input.substring(10)));
                    continue;
                }
            }

            char c = input.charAt(0);

            switch (c) {
                case 's':
                    sb.append(deque.size()).append('\n');
                    break;
                case 'e':
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 'f':
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n');
                    break;
                case 'b':
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n');
                    break;

                case 'p':
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                        break;
                    }
                    if (input.charAt(4) == 'f') sb.append(deque.pollFirst()).append('\n');
                    else sb.append(deque.pollLast()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
