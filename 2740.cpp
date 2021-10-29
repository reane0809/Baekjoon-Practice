#include <cstdio>

int n, m, k, a[105][105], b[105][105];

int main() {
	scanf("%d %d",&n,&m);
	for(int i=1; i<=n; i++){
		for(int j=1; j<=m; j++){
			scanf("%d",&a[i][j]);
		}
	}
	scanf("%*d %d",&k);
	for(int i=1; i<=m; i++){
		for(int j=1; j<=k; j++){
			scanf("%d",&b[i][j]);
		}
	}
	for(int i=1; i<=n; i++){
		for(int j=1; j<=k; j++){
			int r = 0;
			for(int x=1; x<=m; x++){
				r += a[i][x] * b[x][j];
			}
			printf("%d ",r);
		}
		puts("");
	}
}
