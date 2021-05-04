import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//Merge Sorting
public class Main {
    
    static int[][] sortedArr;
    
     public static void main(String []args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];
        sortedArr = new int [arr.length][2];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        mergeSort(arr, 0, N - 1);
        
        for (int[] a : arr){
            sb.append(a[0]).append(' ').append(a[1]).append('\n');
        }
        
        System.out.print(sb);
        br.close();
     }
     
     
    static void mergeSort(int[][] arr, int start, int end) {
        
        if (start == end) return;
        
        int mid = (start + end)/2;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        
        merge(arr, start, mid, end);
    }
     
    static void merge (int[][] arr, int start, int mid, int end) {
        
        int l = start;
        int r = mid + 1;
        int idx = start;
        
        
        while (l <= mid && r <= end) {
            
            if (arr[l][0] == arr[r][0]) {
                if (arr[l][1] < arr[r][1]) {
                    sortedArr[idx] = arr[l];
                    idx++;
                    l++;
                }
                else {
                    sortedArr[idx] = arr[r];
                    idx++;
                    r++;
                }
            } else {
                if (arr[l][0] < arr[r][0]) {
                    sortedArr[idx] = arr[l];
                    idx++;
                    l++;
                }
                else {
                    sortedArr[idx] = arr[r];
                    idx++;
                    r++;
                }
            }
            
            
            if (l > mid) {
                while (r <= end) {
                    sortedArr[idx] = arr[r];
                    idx++;
                    r++;
                }
            }
            else if (r > end) {
                while (l <= mid) {
                    sortedArr[idx] = arr[l];
                    idx++;
                    l++;
                }
            }
        }
        
        for (int i = start; i <= end; i++) {
            arr[i] = sortedArr[i];
        }
    }
}
