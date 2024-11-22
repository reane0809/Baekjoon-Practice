import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
        
		StringBuilder sb = new StringBuilder("<");
		for(int i=1; i<=n; i++) 
			list.add(i);
		
		int i = b - 1;
		while(true) {		
			sb.append(list.get(i));
			list.remove(i);
			
			if(list.size() == 0) 
				break;
			else 
				sb.append(", ");
			i += (b-1);

			if(i >= list.size()) 
				i = (i % list.size());			
		}
		sb.append(">");

		System.out.println(sb);
	}
}

