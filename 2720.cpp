#include<stdio.h>
int main() {
    
	int n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		int x;
		scanf("%d", &x);
		printf("%d %d %d %d\n", x / 25, x % 25 / 10, x % 25 % 10 / 5, x % 25 %10%5);
	}
	return 0;
}
