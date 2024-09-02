#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>

int main() {
	int t = 0; //테스트 개수
	scanf("%d", &t);
	for (int i = 0; i < t; i++) { //테스트 개수만큼 반복
		double x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0, r1 = 0, r2 = 0;
		double d = 0,bigr=0,smallr=0;
		scanf("%lf %lf %lf %lf %lf %lf", &x1, &y1, &r1, &x2, &y2, &r2);

		if (r1 < r2)   {                 //각 거리중 어느게 더 큰지 구별합니다.
			
      bigr = r2;
			smallr = r1;
		}
		else if (r1>r2) {
			bigr = r1;
			smallr = r2;
		}
		else {
			bigr = r1;
			smallr = r2;
		}

		if (x1 == x2 && y1 == y2)     //마린이 위치할 수 있는 경우가 무한대일 때
			if (r1 == r2) {
				printf("-1\n");
				continue;
			}
			else   {                   //위치는 같으나 거리가 다른경우
			
				printf("0\n");
				continue;
			}

		if (x1 == x2)                //두 터렛 사이의 거리 구하기
			d = abs(y1 - y2);
		else if (y1 == y2)
			d = abs(x1 - x2);
		else {
			d = sqrt(((x1 - x2)* (x1 - x2)) +((y1 - y2)* (y1 - y2)));
		}
        
		/* 두 터렛 사이의 거리와 각 터렛으로부터의 마린까지의 거리를 이용하여
            마린이 위치 할 수있는 경우의 수를 구합니다.*/
		if (d > (r1 + r2)||(bigr - smallr)>d)    
			printf("0\n");                      
		else if (d == (r1 + r2) || (bigr - smallr) == d) 
			printf("1\n");                       
		else 
			printf("2\n");
	}
	return 0;
}

