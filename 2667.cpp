#include <stdio.h>
#include <algorithm>
using namespace std;

int n, cnt, sz[400];
int dx[4]={1, 0, -1, 0}, dy[4]={0, 1, 0, -1};
bool house[26][26];

void dfs(int x, int y) {
	house[x][y]=0; sz[cnt]++;
	for(int i=0; i<4; i++) if(house[x+dx[i]][y+dy[i]]) dfs(x+dx[i], y+dy[i]);
}

int main() {
	scanf("%d", &n);
	for(int i=1; i<=n; i++) for(int j=1; j<=n; j++) scanf("%1d", &house[i][j]);
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n; j++) {
			if(house[i][j]) {
				dfs(i, j);
				cnt++;
			}
		}
	}
	sort(sz, sz+cnt);
	printf("%d\n", cnt);
	for(int i=0; i<cnt; i++) printf("%d\n", sz[i]);
}
