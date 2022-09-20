import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static long p = 1000000007;
    static int[] visited;
    static ArrayList<Integer>[] adj;
    static int cnt=1;
    public static void main(String[] args) throws Exception{
        int n = readInt(), m = readInt(), start = readInt();
        visited = new int[n+1];
        adj = new ArrayList[n+1];
        for(int i=1; i<=n; i++) adj[i]= new ArrayList<>();
        while(m-->0){
            int a = readInt(), b = readInt();
            adj[a].add(b); adj[b].add(a);
        }
        for(int i=1; i<=n; i++) Collections.sort(adj[i],Comparator.reverseOrder());
        dfs(start);
        for(int i=1; i<=n; i++) sb.append(visited[i]).append("\n");
        System.out.println(sb);
    }
    static void dfs(int start) {
        visited[start]=cnt++;
        for(int i : adj[start]) if(visited[i]==0) dfs(i);
    }
    static char readChar() throws IOException{
        char x='\n';
        while(true){
            char input = (char) br.read();
            if(input=='\n' || input==' ')
                return x;
            x = input;
        }
    }
    static int readInt() throws IOException {
        int sum = 0;
        boolean isNegative = false;
        while(true){
            int input = br.read();
            if(input=='\n' || input==' ' || input ==',' || input==']')
                return isNegative ? sum*-1 : sum;
            else if(input=='-')
                isNegative = true;
            else
                sum = (sum*10)+input-'0';
        }
    }
    static long readLong() throws IOException {
        long sum = 0;
        boolean isNegative = false;
        while(true){
            long input = br.read();
            if(input=='\n' || input==' ' || input ==',')
                return isNegative ? sum*-1 : sum;
            else if(input=='-')
                isNegative = true;
            else
                sum = (sum*10)+input-'0';
        }
    }
}
