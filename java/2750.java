import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		for(int i=0;i<count;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(arr);
		for(int i=0;i<count;i++) {
			bw.write(String.valueOf(arr[i]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
