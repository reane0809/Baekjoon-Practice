import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		int max = 0, count = 0, index = 0;
		int[] alpha = new int[26];
		Scanner sc = new Scanner(System.in);
		String testCase = sc.nextLine();
		char[] words = (testCase.toUpperCase()).toCharArray();
		
		for(int i = 0; i < words.length; i++) {
			for(int j = 65; j<=90; j++) {
				if(words[i] == (char)j) {
					alpha[j-65]++;
					if(max == 0 || alpha[j-65] > max) {
						max = alpha[j-65];
					}
				}
			}
		}
		
		for(int k = 0; k < alpha.length; k++) {
			if(alpha[k] == max) {
				index = k;
				count++;
			}
		}
		
		if(count == 1) {
			System.out.println((char)(index+65));
		}else {
			System.out.println("?");
		}
	}
}
