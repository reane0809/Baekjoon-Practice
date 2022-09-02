#include <stdio.h>
int X, N, a, b;
int main() {
	scanf("%d%d", &X, &N);
	while(N--) {
		scanf("%d%d", &a, &b);
		X -= a * b;
	}
	printf(X == 0 ? "Yes" : "No");
}
