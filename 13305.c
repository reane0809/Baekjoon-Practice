#include <stdio.h>
int main() {
	int N;
	long long int dist[100000], price[100000];
	scanf("%d", &N);
	for (int n = 0; n < N - 1; n++) {
		scanf("%lld", &dist[n]);
	}
	for (int n = 0; n < N; n++) {
		scanf("%lld", &price[n]);
	}
	long long int sum_p(0);
	long long int cur_p=price[0];
	for (int n = 1; n < N; n++) {
		if (cur_p > price[n]){
			sum_p += cur_p * dist[n - 1];
			cur_p = price[n];
		}
		else {
			sum_p += cur_p * dist[n - 1];
		}
	}
	printf("%lld", sum_p);
}

