import java.io.*;
class Main {
    public static void main(String[] args)throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] reader=new String[2];
        
        reader=br.readLine().split(" ");
        
        int n=Integer.parseInt(reader[0]);
        int m=Integer.parseInt(reader[1]);
        
        reader=br.readLine().split(" ");
        
        m+=Integer.parseInt(reader[0]);
        
        if(m>=60) {
            n+=m/60;
            m=m%60;
        }
        if(n>=24) {
            n=n%24;
        }
        System.out.print(n+" "+m);
    }
}
