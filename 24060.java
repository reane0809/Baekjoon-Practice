import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;
    public static int K;
    public static int rt = -1;
    public static int[] sorted;

    public static void merge(int[] list, int left, int mid, int right) {
        int i, j, k, l;
        i = left;
        j = mid + 1;
        k = left;

        while(i <= mid && j <= right) {
            if(list[i] <= list[j])
                sorted[k++] = list[i++];
            else
                sorted[k++] = list[j++];
        }

        if(i > mid) {
            for(l = j; l <= right; l++)
                sorted[k++] = list[l];
        }
        else {
            for(l = i; l <= mid; l++)
                sorted[k++] = list[l];
        }

        for(l = left; l <= right; l++) {
            list[l] = sorted[l];
            count++;
            if(count == K) {
                rt = sorted[l];
            }
        }
    }

    public static void merge_sort(int[] list, int left, int right) {
        int mid;

        if(left < right) {
            mid = (left + right) / 2;
            merge_sort(list, left, mid);
            merge_sort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        sorted = new int[N];
        int[] list = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(list, 0, list.length - 1);
        
        System.out.println(rt);
    }
}
