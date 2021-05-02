import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] ARR;
    static int[] POS;
    static int[] LIST;
    static int sz;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        ARR = new int[N];
        POS = new int[N];
        LIST = new int[N];
        sz = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ARR[i] = Integer.parseInt(st.nextToken());
            POS[i] = ARR[i];
        }

        Arrays.sort(POS);

        int before = -1;
        int pos = 0;

        for (int i = 0; i < N; i++) {
            if (before == -1) {
                before = POS[i];
                LIST[sz++] = POS[i];
            } else {
                if (before != POS[i]) {
                    LIST[sz++] = POS[i];
                    before = POS[i];
                }
            }
        }

        for (int i = 0; i < N; i++)
            sb.append(binarySearch(ARR[i]) + " ");

        System.out.println(sb);
    }

    public static int binarySearch(int key) {
        int left, mid, right;

        left = 0;
        right = sz - 1;

        while (left <= right) {
            mid = (left + right) / 2;

            if (LIST[mid] > key) {
                right = mid - 1;
            } else if (LIST[mid] < key) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
