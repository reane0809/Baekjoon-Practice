#include <cstdio>
#include <algorithm>

int n, m, x, y, z, a[105];
int main() {
	int i;
	scanf("%d%d", &n, &m);
	for(i=1; i<=n; i++) a[i] = i;
	while(m--) {
		scanf("%d%d%d", &x, &y, &z);
		std::rotate(a+x, a+z, a+y+1);
	}
	for(i=1; i<=n; i++) printf("%d ", a[i]);
	return 0;
}
