import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i_N = Integer.parseInt(br.readLine());
		int size = String.valueOf(i_N).length();
		int start = i_N - (9*size);
		int return_N = 0;
		for(int i = start; i<=i_N; i++) {
			
			String s_i = String.valueOf(i);
			int[] input_arr = new int[s_i.length()];
			for(int j = 0; j < s_i.length(); j++) {
				input_arr[j] = s_i.charAt(j) - '0';
			}
			int i_i =  Integer.parseInt(s_i);
			int sum_ = i_i;
			
			for(int x = 0; x < input_arr.length; x++) {
				sum_ = sum_ + input_arr[x];
			}
			
			if(sum_ == i_N) {
				return_N = i_i;
				break;
			}
		}
		
		bw.write(String.valueOf(return_N));
		br.close();
		bw.close();
	}

}

