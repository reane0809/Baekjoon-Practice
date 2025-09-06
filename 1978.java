import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        boolean temp = true;
        int cnt = 0;
        for(int j = 0; j < N; j++ ){
            int M = Integer.parseInt(st.nextToken());
            if(M != 1){
                for(int i = 2; i <= Math.sqrt(M) ; i++){
                    if(M % i == 0){
                        temp = false;
                        break;
                    }
                }

            }else{
                temp = false;
            }
            if(temp == true){
                cnt += 1;
            }
            temp = true;
        }
        System.out.println(cnt);
    }
}

