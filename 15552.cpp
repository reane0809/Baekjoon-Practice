#include <iostream>

using namespace std;

int T, A, B, C;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> T;
	for (int i = 0; i < T; i++)
	{
		cin >> A;
		cin >> B;
		C = A + B;
		cout << C << '\n';
	}
}
