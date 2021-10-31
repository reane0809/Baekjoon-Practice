import java.io.*;
import java.util.*;

public class Main{
	
	private static int[][] pow(int[][] arr,long a){
		if(a==1){
			return arr;
		}else if(a%2==0){
			int[][] pow=pow(arr,a/2);
			return mul(pow,pow);
		}else{
			return mul(arr,pow(arr,a-1));
		}
	}
	
	private static int[][] mul(int[][] a,int[][] b){
		int n=a.length;
		int[][] mul=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					mul[i][j]+=a[i][k]*b[k][j]%1000;
				}
			}
		}
		return mul;
	}
	
    public static void main(String[] args)throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	
    	StringTokenizer s=new StringTokenizer(br.readLine().trim());
    	int n=Integer.parseInt(s.nextToken());
    	long b=Long.parseLong(s.nextToken());
    	StringBuilder sb = new StringBuilder("");
    	int[][] arr=new int[n][n];
    	for(int i=0;i<n;i++){
    		s=new StringTokenizer(br.readLine().trim());
    		for(int j=0;j<n;j++){
    			arr[i][j]=Integer.parseInt(s.nextToken());
    		}
    	}
    	arr=pow(arr,b);
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			sb.append((arr[i][j]%1000)+" ");
    		}
    		sb.append("\n");
    	}
    	System.out.println(sb.toString());
    }
}
