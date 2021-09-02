import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String [] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String input;
		int top, i;
		while(N-->0)
		{
			top = -1;
			input = br.readLine();
			for(i=0; i<input.length(); i++)
			{
				if(input.charAt(i)=='(')
					top++;
				else
				{
					top--;
					if(top<-1)break;
				}
			}
			if(top==-1)
				sb.append("YES");
			else
				sb.append("NO");
			if(N!=0)
				sb.append("\n");
		}
		System.out.print(sb);
	}
}
