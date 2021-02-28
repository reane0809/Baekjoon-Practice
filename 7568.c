#include <stdio.h>

main() {
	int N, arr[50][2];
	scanf("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf("%d %d", &arr[i][0], &arr[i][1]);
	}


	for (int k = 0; k < N; k++) {
		int rank = 1;
		{for (int l = 0; l < N; l++) {
			if(arr[k][0] < arr[l][0] && arr[k][1] < arr[l][1]){ rank++; }
		}
		printf("%d ", rank); }
	}

}
