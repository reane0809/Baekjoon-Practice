import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static boolean[] sosu = new boolean[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        makeSosu();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            int S = num/2;
            int M = num/2;

            while (true){

                if(!sosu[S] && !sosu[M]){
                    sb.append(S).append(" ").append(M).append("\n");
                    break;
                }

                S--;
                M++;
            }
        }
        System.out.println(sb.toString());

    }

    public static void makeSosu() {
        sosu[0] = true;
        sosu[1] = true;

        for(int i = 2; i <= Math.sqrt(sosu.length); i++){
            if(sosu[i]) continue;
            for(int j = i*i; j < sosu.length; j+=i ){
                sosu[j] = true;
            }
        }

    }
}
