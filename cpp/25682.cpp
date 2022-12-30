#include <iostream>
#include <vector>

using namespace std;
int main(){
    cin.tie(0) -> sync_with_stdio(0);
    int n, m, k; cin >> n >> m >> k;
    vector w(n+1, vector(m+1, 0));
    for(int i = 1; i <= n; ++i){
        string s; cin >> s;
        for(int j = 0; j < m; ++j)
            w[i][j+1] = w[i][j] + (((s[j]=='B')^i^j)&1);
    }
    for(int i = 0; i < n; ++i)
        for(int j = 1; j <= m; ++j)
            w[i+1][j] += w[i][j];
    
    int ans = 2147483647;
    for(int i = 0; i <= n-k; ++i)
        for(int j = 0; j <= m-k; ++j){
            int tmp = w[i][j] - w[i][j+k] - w[i+k][j] + w[i+k][j+k];
            tmp = min(tmp, k*k-tmp);
            ans = min(ans, tmp);
        }
    cout << ans;
}
