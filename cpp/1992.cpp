#include <stdio.h>

int N;
char S[64][64 + 1];

void check(int y, int x, int s){
	int i, u;

	for (i = 0; i < s; i++){
		for (u = 0; u < s; u++){
			if (S[y][x] - S[y + i][x + u]) break;
		}
		if (u < s) break;
	}

	if (i == s){
		printf("%c", S[y][x]);
		return;
	}

	printf("(");
	check(y, x, s / 2);
	check(y, x + s / 2, s / 2);
	check(y + s / 2, x, s / 2);
	check(y + s / 2, x + s / 2, s / 2);
	printf(")");
}

int main(){
	int i;

	scanf( "%d", &N);
	for (i = 0; i < N; i++) scanf( "%s", S[i]);

	check(0, 0, N);

	return 0;
}
