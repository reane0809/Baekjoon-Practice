#include<cstdio>

int main() {
	int n;
	scanf("%d", &n);
	for (int i = n - 60; i < n; ++i) {
		int t = i, tt = 0;
		while (t) {
			tt += t % 10;
			t /= 10;
		}
		if (i + tt == n) {
			printf("%d", i);
			return 0;
		}
	}
	printf("0");
}
