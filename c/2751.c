#include<stdio.h>
int sorted[1000000];
void mergeSort(int a[], int m, int n);
void merge(int a[], int m, int middle, int n);
int main() {
	int n;
	scanf("%d", &n);
	int list[1000000] = { 0 };
	for (int i = 0; i < n; i++) {
		scanf("%d", &list[i]);
	}
	mergeSort(list, 0, n - 1);
	for (int i = 0; i < n; i++)
		printf("%d\n", list[i]);
	return 0;
}
void mergeSort(int a[], int m, int n) {
	int middle;
	if (m < n) {
		middle = (m + n) / 2;
		mergeSort(a, m, middle);
		mergeSort(a, middle + 1, n);
		merge(a, m, middle, n);
	}
}
void merge(int a[], int m, int middle, int n) {
	int i = m;
	int j = middle + 1;
	int k = m;
	while (i <= middle&&j <= n) {
		if (a[i] < a[j]) {
			sorted[k] = a[i];
			i++;
		}
		else {
			sorted[k] = a[j];
			j++;
		}
		k++;
	}
	if (i > middle)
		for (int t = j; t <= n; t++, k++)
			sorted[k] = a[t];
	else
		for (int t = i; t <= middle; t++, k++)
			sorted[k] = a[t];

	for (int t = m; t <= n; t++)
	a[t] = sorted[t];
}
