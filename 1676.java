import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		int c = 0;
		while(num > 1) {
			if(num%5 == 0) c++;
			if(num%25 == 0) c++;
			if(num%125 == 0) c++;
			num--;
		}
		System.out.println(c);
	}
	
}
