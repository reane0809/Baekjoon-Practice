import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException  {
    BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int count=0;
    int result=0;
    int i =0;
    int buf =0;
    
    
    while(true) {
    	buf=i;
    	
    	if(buf%1000==666) {
    		result = i;
    		count++;
    	} else {
    		while(true) {
        		buf=buf/10;
        		if(buf%1000==666) {
        			result =i; count++;
        			break;
        		}
    		if(buf/666==0) break;
    		}
    		
    	}  		
    	
		i++;
    	if(count ==n) {
        	System.out.println(result);break;	
    	}
    }
    
    }}
