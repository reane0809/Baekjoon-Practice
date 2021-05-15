#include <iostream>
using namespace std;

void init() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);
	return;
}

void input(int* n, int* m);
void solve(int arr[], int index, int n, int m);
void output(int arr[], int m);

int main(void) {
	init();
	int n, m;
	input(&n, &m);
	int arr[8] = { 0 };
	solve(arr, 0, n, m);
	return 0;
}

void input(int* n, int* m) {
	cin >> *n >> *m;
}

void solve(int arr[], int index, int n, int m) {
	if (index == m) {
		output(arr, m);
		return;
	}

	for (int i = (index ? arr[index - 1] + 1 : 1 ); i <= n; i++) {
		arr[index] = i;
		solve(arr, index + 1, n, m);
	}
}

void output(int arr[], int m) {
	for (int i = 0; i < m; i++) {
		cout << arr[i] << ' ';
	}
	cout << '\n';
	return;
}
