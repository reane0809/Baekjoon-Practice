import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static int[][][] tomatos;
    public static Deque<Location> deque;

    public static int row;
    public static int column;
    public static int depth;

    // 덜 익은 토마토의 수
    public static int greenTomato = 0;

    public static void main(String[] args) throws Exception {
        column = read();
        row = read();
        depth = read();

        deque = new LinkedList<>();
        tomatos = new int[depth + 1][row + 1][column + 1];
        for (int i = 1; i <= depth; i++) {
            for (int j = 1; j <= row; j++) {
                for (int k = 1; k <= column; k++) {
                    final int state = System.in.read() - 48;
                    tomatos[i][j][k] = state;

                    // 빈 공간일 경우
                    if (state == -3) {
                        System.in.read();
                    }

                    // 덜 익은 토마토일 경우
                    if (state == 0) {
                        greenTomato++;
                    }

                    // 익은 토마토일 경우
                    if (state == 1) {
                        deque.add(new Location(i, j, k));
                    }

                    // 공백
                    System.in.read();
                }
            }
        }

        if (greenTomato == 0) {
            System.out.println(0);
            return;
        }

        System.out.println(dfs());
    }

    private static int read() throws Exception {
        int c, N = System.in.read() - 48;
        while ((c = System.in.read()) > 32)
            N = 10 * N + c - 48;

        return N;
    }

    private static int dfs() {
        int answer = 0;
        int red = 0; // 초록이었다가 빨강으로 변한 토마토 수

        // 방향벡터 - 위 아래 동 서 남 북
        int[] dx = {0, 0, 1, -1, 0, 0};
        int[] dy = {0, 0, 0, 0, 1, -1};
        int[] dz = {1, -1, 0, 0, 0, 0};

        while (!deque.isEmpty()) {
            if (red == greenTomato) {
                return answer;
            }

            int size = deque.size();
            for (int i = 0; i < size; i++) {
                Location location = deque.pop();
                final int tomatoColumn = location.column;
                final int tomatoRow = location.row;
                final int tomatoDepth = location.depth;

                for (int j = 0; j < 6; j++) {
                    int newRow = tomatoRow + dy[j];
                    int newColumn = tomatoColumn + dx[j];
                    int newDepth = tomatoDepth + dz[j];

                    // 유효성 확인 - 박스를 넘어가는지 혹은 이미 익은 토마토인지
                    if (newRow <= 0 || newColumn <= 0 || newDepth <= 0
                            || newRow > row || newColumn > column || newDepth > depth
                            || tomatos[newDepth][newRow][newColumn] != 0) {
                        continue;
                    }

                    // 익은 토마토 갱신
                    red++;

                    tomatos[newDepth][newRow][newColumn] = 1;

                    deque.add(new Location(newDepth, newRow, newColumn));
                }
            }

            answer++;
        }

        return -1;
    }

    private static class Location {
        int depth;
        int row;
        int column;

        public Location(int depth, int row, int column) {
            this.depth = depth;
            this.row = row;
            this.column = column;
        }
    }
}
