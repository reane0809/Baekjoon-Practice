import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];
        int size = N;

        int end = N;
        int start = 1;

        int count = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<M; i++){
           int k = arr[i];
           int left = k - start;
           int right = end - k + 1;

           if(left <= right){ // 왼쪽으로 회전
               count += left;
               for(int j=i+1; j<M; j++){
                   if(arr[j] < k){ //왼쪽에 위치
                       arr[j] = arr[j] + end - k + 1;
                   }else{ // 오른쪽에 위치
                       arr[j] = arr[j] - left;
                   }
               }
           }else{ // 돌아서 회전
               count += right;
                for(int j=i+1; j<M; j++){
                    if(arr[j] < k){ //왼쪽에 위치
                         arr[j] = arr[j] + right;
                    }else{ //오른쪽에 위치
                        arr[j] = start + arr[j] - k;
                    }
                }
           }
           start += 1;
        }

        bw.write(count+"\n");
        bw.flush();
    }
}
