#pragma warning(disable: 4996)

#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<memory.h>
#include<string.h>

#define MAX2(a, b) 	((a) > (b) ? (a) : (b))
#define MIN2(a, b) 	((a) < (b) ? (a) : (b))
#define ABS(x) 		((x) < 0 ? -(x) : (x))

#define MAX_N 1000 

void print_array(int size, int * arr) {
	int i;
	for (i = 0; i < size; i += 1) {
		printf("%d\n", arr[i]);
	}
}

int main() {
	int N;
	int A[MAX_N];
	int i, j;

	scanf("%d", &N);

	for (i = 0; i < N; i += 1) {
		scanf("%d", &A[i]);
	}

	int tmp;
	for (i = N - 2; i >= 0; i--) {
		for (j = 0; j <= i; j++) {
			if (A[j] > A[j + 1]) {
				tmp = A[j + 1];
				A[j + 1] = A[j];
				A[j] = tmp;
			}
		}
	}

	print_array(N, A);
	return 0;
}
