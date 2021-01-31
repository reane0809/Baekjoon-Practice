import java.util.*;
import java.io.*;

public class Main{    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] input = s.toCharArray();
        int count = input.length;
        for(int i=0;i<input.length-1;i++){
            switch(input[i]){
                case 'c': if(input[i+1]=='='||input[i+1]=='-') {count--; i++;}
                    break;
                case 'd': if(input[i+1]=='-') {count--; i++;}
                    else if(i+2<input.length&&input[i+1]=='z'&&input[i+2]=='=') {count-=2; i+=2;}
                    break;
                case 'l':
                case 'n': if(input[i+1]=='j') {count--; i++;}
                    break;
                case 's':
                case 'z': if(input[i+1]=='=') {count--; i++;}
                    break;
            }
        }
        
        System.out.print(count);
    }
}
