#include <stdio.h>
int main() {
    
	int n, x, y, s=0;
	int a[101][101]={};
	scanf("%d", &n);
    
	for(int i=1;i<=n;i++) {
        
		scanf("%d %d", &x, &y);
		for(int j=x;j<x+10;j++)
			for(int k=y;k<y+10;k++)
				a[j][k]=1;
	}
	for(int i=1;i<=100;i++)
		for(int j=1;j<=100;j++)
			if(a[i][j]==1) s++;
			
	printf("%d", s);
}
