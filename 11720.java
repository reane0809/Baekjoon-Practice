import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		String num = scan.next();
		
		for(int i=0; i<n; i++) {
			String arr[] = num.split("");
//			System.out.println(arr[i]);
			int num2 = Integer.parseInt(arr[i]);
			
			sum += num2;
		}
		System.out.print(sum);
		scan.close();
	}
}

