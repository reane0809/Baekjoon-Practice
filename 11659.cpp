#include <iostream>
using namespace std;
int main() {
    
	ios_base::sync_with_stdio(0);
	cin.tie(0);
    
	int N, M, T, i, j, Ns[100001];
	cin >> N >> M;
	Ns[0] = 0;
	for (int v = 1; v <= N; v++) 
        cin >> T, Ns[v] = T + Ns[v - 1];
	while (M--) 
        cin >> i >> j, cout << Ns[j] - Ns[i - 1] << '\n';
}
