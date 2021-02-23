import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int input=Integer.parseInt(br.readLine());
		System.out.println(dd(input));
		
	}	
	static public int dd(int i) {
		if(i==0) {
			return 0;
		}
		else if(i==1) {
			return 1;
		}
		else {
			return dd(i-1)+dd(i-2);
		}
	}
}
