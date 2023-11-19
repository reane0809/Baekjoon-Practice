#include <iostream>
using namespace std;
int n, m;

char arr[20];
void dfs(int depth) {

	if (depth == m) {
		cout << arr << '\n';
		return;
	}
	for (int i = 1; i <= n; i++) {
			arr[depth * 2] = i + 48;
		
		dfs(depth + 1);
	}
	

}
int main() {
	cin >> n >> m;
	for (int i = 0; i < 2 * m; i++)
		arr[i] = 32;

	dfs(0);
	return 0;
}
