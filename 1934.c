#include<stdio.h>
#include<algorithm>


int GCD(int a, int b) {// 최대공약수
	if (b == 0) {
		return a;
	}
	else {
		return GCD(b, a % b);
	}
}

int LCM(int a, int b) {// 최소공배수

	return a * b / GCD(a, b);
}

int main(void) {
	int T,a,b;
	scanf("%d", &T);

	for (int i = 0; i < T; i++) {
		scanf("%d %d", &a, &b);
		printf("%d\n", LCM(a, b));
	}
}
