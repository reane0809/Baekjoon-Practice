import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 킹1, 퀸1, 룩2, 비숍2, 나이트2, 폰8
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pone = 8;
        int[] arr = {1, 1, 2, 2, 2, 8};
        
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        for(int i = 0; i < 6; i++){
            arr[i] -= Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < 6; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
