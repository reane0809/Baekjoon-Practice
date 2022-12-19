#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;
int main() {
	ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
	int n, x;
	queue<int> q;
	cin >> n;
	while (1) {
		cin >> x;
		if (x > 0 && q.size() < n) q.push(x);
		else if (x == 0 && q.size()) q.pop();
		else if (x == -1) break;
	}
	if (q.empty()) cout << "empty";
	while (q.size()) {
		cout << q.front() << " ";
		q.pop();
	}
}
