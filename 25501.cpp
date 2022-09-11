#include <bits/stdc++.h>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, cnt;
	bool p;
	string s;

	cin >> n;
	while (n--) {
		cin >> s;

		cnt = 0;
		p = true;
		for (int i = 0; i <= (s.size() / 2); i++) {
			cnt++;
			if (s.at(i) != s.at(s.size() - (i + 1))) {
				p = false;
				break;
			}
		}

		cout << p << " " << cnt << "\n";
	}

	return 0;
}
