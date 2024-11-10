import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());
        bw.write((int)Math.pow(2,N)-1+"\n");
        
        int source = 1;
        int destination = 3;
        int temp = 2;
        m.hanoi(source,destination,temp,N, bw);
        
        bw.flush();
        bw.close();
        br.close();
        
    }
    
    public void hanoi(int source, int destination, int temp, int n, BufferedWriter bw)throws IOException{
        if(n <= 0 )return;
        hanoi(source, temp, destination, n-1,bw);
        bw.write(source+" "+destination+"\n");
        hanoi(temp, destination, source, n-1,bw);
    } 
}

