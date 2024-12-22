#include <stdio.h>

int fac(int N) {
	if (N <= 1) return 1;
	return N * fac(N - 1);
}
int main() {
	int N;
	
	scanf("%d", &N);
	printf("%d", fac(N));

	return 0;
}

