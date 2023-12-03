#include <bits/stdc++.h>
using namespace std;
int main() {
	cin.tie(0);
	ios::sync_with_stdio(0);

	int arr[9];
	for (int i = 1; i <= 9; i++) {
		cin >> arr[i];
	}
	int max = arr[0];
	int id;
	for (int k = 1; k <= 9; k++) {
		if (max < arr[k]) {
			max = arr[k];
			id = k;
		}
	}
	cout << max << "\n" << id;
}
