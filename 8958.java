import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		short testCase = sc.nextShort();
        sc.nextLine();

		for (short i = 1; i <= testCase; i++) {
			String OX = sc.nextLine();
			short sum = 0;
			short count = 0;
			for (short j = 0; j < OX.length(); j++) {
				if (OX.charAt(j) == 'O') {
					count++;
					sum += count;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
