import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main{
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(rd.readLine());
		int arr[] = new int[n];
		String str = rd.readLine();
		String ch[] = str.split(" ");
		for(int i=0; i<ch.length;i++) {
		arr[i]=Integer.parseInt(ch[i]);
		}
		Arrays.sort(arr);
		int ans = 0;
		for(int i=0; i<arr.length;i++) {
		ans+= arr[i]*(arr.length-i);	
		}
		System.out.println(ans);
	}
}

