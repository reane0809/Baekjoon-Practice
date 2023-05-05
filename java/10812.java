import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // m번 회전

        int[] basket = new int[n + 1];
        int[] newBasket = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            basket[i] = i;
            newBasket[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());
            int index = begin;

            for (int j = 0; j < end - begin + 1; j++) {
                if (mid + j <= end) {
                    newBasket[begin + j] = basket[mid + j];
                } else {
                    newBasket[begin + j] = basket[index++];
                }
            }

            for (int j = 1; j <= n; j++) {
                basket[j] = newBasket[j];
            }

        }

        for (int i = 1; i <= n; i++) {
            bw.write(newBasket[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
