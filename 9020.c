#include <stdio.h>

int main() {
    int c[10000] = {0,1,}; int i, j;
	for (i=2;i<=10000;i++) {for (j=2;i*j<=10000;j++) {c[i*j]=1;}}
    int z; scanf("%d", &z);
    int a;
    for(int k=0;k<z;k++) {
        scanf("%d", &a);
        for(int l=a/2;a>=0;l--) {
            if(!c[l]&&!c[a-l]){printf("%d %d\n", l, a-l); break;}
        }
    }
    return 0;
}
