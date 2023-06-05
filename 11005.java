import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;
		StringBuilder sb=new StringBuilder();
		
		st=new StringTokenizer(br.readLine());
		
		long N=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		while(N>0){
			long num=N%B;
			N=N/B;
			
			if(num>=10){
				char ch=(char) (num+55);
				sb.append(ch);
			}else{
				sb.append(num);
			}
			
		}
		sb.reverse();
		System.out.println(sb);

	}
}
