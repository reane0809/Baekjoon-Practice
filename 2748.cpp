#include <stdio.h>
int main() {
	int matA[100][100];
	int matB[100][100];

	int N, M;
	scanf("%d%d", &N, &M);
	for(int n=0; n<N; n++)
		for(int m=0; m<M; m++)
			scanf("%d", &matA[n][m]);
	for(int n=0; n<N; n++)
		for(int m=0; m<M; m++)
			scanf("%d", &matB[n][m]);
	for(int n=0; n<N; n++) {
		for(int m=0; m<M; m++){
			printf("%d ", matA[n][m] + matB[n][m]);
		}
		printf("\n");
	}
	return 0;
}
