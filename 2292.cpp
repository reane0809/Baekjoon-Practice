#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {
	int n;
	scanf("%d", &n);
	int N = 1;
	if (n == 1) {
		printf("%d\n", N);
		return 0;
	}
	while (n != 1) {
		if ((n - 1) <= (N*(N + 1))*3)
			break;
		N++;
	}
	printf("%d\n", N+1);
	return 0;
}
