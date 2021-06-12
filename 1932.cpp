#include <iostream>
#include <algorithm>
using namespace std;
int st[501];

int main() {
  cin.tie(NULL);
  ios::sync_with_stdio(false);

  int n, m, ans = -1;
  cin >> n;
  cin >> st[0];

  for (int i = 1; i < n; i++) {
    for (int j = i; j >= 0; j--) {
      cin >> m;
      if (j == i) st[j] = st[j - 1] + m;
      else if (j == 0) st[0] += m;
      else st[j] = max(m + st[j - 1], m + st[j]);
    }
  }

  for (int i = 0; i < n; i++) {
    if (st[i] > ans) ans = st[i];
  }

  cout << ans << '\n';

  return 0;
}
