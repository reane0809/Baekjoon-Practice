import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
		
public class Main {
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] infor = br.readLine().split(" ");
		int n = Integer.parseInt(infor[0]);
		int m = Integer.parseInt(infor[1]);
		
		String[] hear = new String[n];
		String[] look = new String[m];
		for(int i=0; i<n; i++) hear[i] = br.readLine();
		for(int j=0; j<m; j++) look[j] = br.readLine();
		
		Arrays.sort(hear);
		Arrays.sort(look);
		
		int start = 0;
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<hear.length; i++)
			for(int j=start; j<look.length; j++) {
				int compare = hear[i].compareTo(look[j]);
				if(compare>=0) {
					if(compare==0) {
						answer++;
						sb.append(System.lineSeparator()).append(hear[i]);
					}
				}
				else {
					start=j;
					break;
				}
			}
				
		
		sb.insert(0, answer);
		System.out.print(sb);
	}
}
