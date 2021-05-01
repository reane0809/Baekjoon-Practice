import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int memberCount = Integer.parseInt(br.readLine());
        StringBuilder[] sbList = new StringBuilder[201];

        // sbList 초기화
        for(int i = 0; i < 201; i++) sbList[i] = new StringBuilder();
        for(int i = 0; i < memberCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            sbList[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder sb_ : sbList) sb.append(sb_);
        System.out.println(sb);
    }
}
