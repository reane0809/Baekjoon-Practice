import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {

        int N = read(), M = read(), V = read() - 1;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(N);
        for (int i = 0; i < N; i++) graph.add(new ArrayList<>());

        while (M-->0) {
            int from = read() - 1;
            int to   = read() - 1;
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        StringBuilder sb = new StringBuilder();
        dfs(graph, V, sb, new boolean[N]);
        bfs(graph, V, sb, new boolean[N]);
        System.out.println(sb);

    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int v, StringBuilder sb, boolean[] visited) {

        visited[v] = true;
        sb.append(v + 1).append(' ');

        ArrayList<Integer> vertex = graph.get(v);
        int size = vertex.size();
        vertex.sort((o1, o2) -> o1 - o2);

        for (int i = 0; i < size; i++) {

            int w = vertex.get(i);

            if (!visited[w]) dfs(graph, w, sb, visited);

        }

    }

    private static void bfs(ArrayList<ArrayList<Integer>> graph, int v, StringBuilder sb, boolean[] visited) {

        sb.append('\n');

        LinkedList<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(v);

        while (!queue.isEmpty()) {

            v = queue.poll();
            sb.append(v + 1).append(' ');

            ArrayList<Integer> vertex = graph.get(v);
            int size = vertex.size();

            for (int i = 0; i < size; i++) {

                int w = vertex.get(i);

                if (!visited[w]) {
                    visited[w] = true;
                    queue.offer(w);
                }

            }

        }

    }

    private static int read() throws Exception {

        int c, N = System.in.read() - 48;
        while ((c = System.in.read()) > 32) N = 10 * N + c - 48;

        return N;

    }

}
