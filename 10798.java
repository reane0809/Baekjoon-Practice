import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		String [] words = new String[5];
		for(int i=0; i<5; i++){
			String tc = br.readLine();
			words[i] = tc;
			max = Math.max(tc.length(), max);
		}
		for(int j=0; j<max; j++){
			for(int i=0; i<5; i++){
				if(j>=words[i].length()){
					
				}
				else{
					System.out.print(String.valueOf(words[i].charAt(j)));
				}
			}
		}
	}

}
