import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main
{

    public static void main (String[] args) throws java.lang.Exception
    {
        
       // System.setIn(new FileInputStream("input.txt"));
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        
        int l = 0;
        int cnt = 0;
        //x = 4 -> 3/1
        while(true) {
            l++;
            cnt += l;
            if(cnt >= x) {
                break;
            }
            
        }
        int first,second;

//l = 3, cnt = 6   //l = 4, cnt = 10 
        if(l %2 == 0 ) {
            first = l;
            second = 1;
            while(cnt > x) {
                cnt--;
                first--;
                second++;
            }
        } else {
           
            first = 1;
            second = l;
            while(cnt > x) {
                cnt--;
                first++;
                second--; 
            }
        }
        System.out.println(first + "/" + second);

    }
}

