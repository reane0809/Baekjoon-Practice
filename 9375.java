import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[] kind = new String[30];
		int[] kindCount = new int[30];
		int[] sum = new int[30];
		
		
		
		int count = Integer.parseInt(br.readLine());
		while(count-->0){
			for(int i=0;i<30;i++){
				kindCount[i]=0;
				sum[i]=0;
			}
			int top=0;
			int totalSum=0;
			int tempSum=0;
			
			int num = Integer.parseInt(br.readLine());
			//System.out.println(num);
			for(int i=0;i<num;i++){
				st = new StringTokenizer(br.readLine());
				String a,b;
				a=st.nextToken();
				b=st.nextToken();
				//System.out.println(a+" "+b);
				boolean gotIt=false;
				for(int j=0;j<top;j++){
					if(kind[j].equals(b)){
						gotIt=true;
						kindCount[j]++;
					}
				}
				if(!gotIt){
					kind[top]=b;
					kindCount[top]++;
					top++;
				}
			}
			//System.out.println(top);
			for(int i=top-1;i>=0;i--){
				sum[i]=kindCount[i]*(1+tempSum);
				tempSum+=sum[i];
			}
			for(int i=0;i<top;i++){
				totalSum+=sum[i];
			}
			System.out.println(totalSum);
		}
		
		
		
	}
}
