import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			cnt = 0;
			String str = br.readLine();
			sb.append(isPalindrome(str)).append(" ").append(cnt).append("\n");
		}
		System.out.print(sb);
	}
	static int recursion(String s, int l, int r) {
		++cnt;
		if(l>=r) return 1;
		else if(s.charAt(l)!=s.charAt(r)) return 0;
		else return recursion(s, l+1, r-1);
	}
	static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
}
