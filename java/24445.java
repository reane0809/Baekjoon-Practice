import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static ArrayList<SortedSet<Integer>> aai; //인접리스트
    static int[] xarr; //방문했는지 기록
    static int count = 1;
    static Queue<Integer> qi = new LinkedList<>();

    public static void bfs(int z) {
        while (qi.size() != 0) {
            int tmp = qi.poll();
            for (int node : aai.get(tmp)) {
                if (xarr[node] == 0) {
                    xarr[node] = count++;
                    qi.add(node);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken()) + 1;
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        xarr = new int[x]; // 방문한거 확인하기
        aai = new ArrayList<>(x); //인접리스트 초기화(1 ~ x)
        for (int i = 0; i < x; i++) {
            aai.add(new TreeSet<>(Collections.reverseOrder()));
        }
        //값 넣기
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            aai.get(a).add(b);
            aai.get(b).add(a);
        }

        qi.add(z); //c를 큐에 넣어
        xarr[z] = count++;

        bfs(z);

        for (int i = 1; i < x; i++) {
            sb.append(xarr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
