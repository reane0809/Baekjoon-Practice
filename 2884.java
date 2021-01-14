import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
									// Q. 45분 일찍 알람 설정하기
		int h = sc.nextInt();
		int m = sc.nextInt();
		int newH = 0;
		int newM = 0;

		if (-1 < h && h < 24) {   // 0시~23시까지
			if (-1 < m && m < 60) { // 0분~59분까지
				if (h == 0 && m < 45) {
					h=23;
					m=m+60;
				}
				newH = (((h*60)+m)-45)/60;	// 시간을 분으로 계산해 총 몇분인지 구한 후 60으로 나누어 나온 시간 계산
				newM = (((h*60)+m)-45)%60;  // 총 나온 분을 60으로 나눈 몫을 구해 남은 분이 총 몇분이 나오는지 계산
			}
		}
		
		System.out.print(newH + " " + newM);
	}
}
