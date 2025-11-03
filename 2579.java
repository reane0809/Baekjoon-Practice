import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stairNum = Integer.parseInt(br.readLine());
        int costs[] = new int[stairNum + 1];

        int costStep[] = new int[stairNum + 1];

        for(int i = 1;i<=stairNum;i++){
            costs[i] = Integer.parseInt(br.readLine());
        }

        costStep[1] = costs[1];

        if(stairNum >= 2){
            costStep[2] = costs[1] + costs[2];
        }

        for(int i = 3;i<=stairNum ; i++){
            costStep[i] = Math.max(costStep[i - 2], costStep[i - 3] + costs[i - 1]) + costs[i];
        }

        bw.write(String.valueOf(costStep[stairNum]));

        bw.flush();
        bw.close();


    }
}

