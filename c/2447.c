#include <iostream>
#include <stdio.h>
using namespace std;


char star[2187][2188];

int blank(int r, int c, int d) {
	for (int t1 = r; t1 < r+d; t1++)
		for (int t2 = c; t2 < c + d; t2++)
			star[t1][t2] = ' ';

	return 0;
}

int stemp(int N, int row, int col) {
	if (N < 3)
		return 0;

	int div = N / 3;

	for (int i = 0; i < 3; i++) {					
		for (int j = 0; j < 3; j++) {	

			if (i == 1 && j == 1)
				blank(row + div, col + div, div);

			else
				stemp(div, row + div * i, col + div * j);	
		}
	}
    	return 0;
}

int main() {

	int N;
	scanf("%d", &N);

	for (int i = 0; i <= N; i++) {
		for (int j = 0; j <= N; j++) {
				star[i][j] = '*';
		}
	}

	stemp(N, 0, 0);

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			printf("%c", star[i][j]);
		}
		printf("\n");
	}
}
