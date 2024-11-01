#include<stdio.h>
int arr[1000000];
int main() {
	int MAX;
	int MIN;
	int i = 0;
	int N;
	scanf("%d", &N);

	for (i = 0; i < N; i++) {
		scanf("%d", &arr[i]);
	}

	MAX = arr[0];
	MIN = arr[0];
	for (int i = 0; i < N; i++) {
		if (MAX <= arr[i]) {
			MAX = arr[i];
		}
		if (MIN >= arr[i]) {
			MIN = arr[i];
		}
	}

	printf("%d %d", MIN, MAX);

}
