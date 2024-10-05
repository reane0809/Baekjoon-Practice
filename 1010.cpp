#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int t;
int a, b;
int check[31][31];
int comb(int n, int m) {
	if (n == m || m == 0) {
		return 1;
	}
	else if (m < 0 || n < m) {
		return 0;
	}
	else {
		if (check[n][m])return check[n][m];
		else {
			check[n][m] = comb(n - 1, m - 1) + comb(n - 1, m);
			return check[n][m];
		}
	}
}
int main() {
	ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

	cin >> t;
	while (t--) {
		cin >> a >> b;
		cout << comb(b, a) << "\n";
	}
}

