#include <stdio.h>
#include <stdlib.h>
using namespace std;

size_t n;
int *x, ans = 65535, save = 0, half;
void nck(int u, int v){
    if (v == 0){
        if (ans > abs(save-half))ans = abs(save-half);
        return;
    }
    for(int i = u+1; i <= n - v; i++){
        save += x[i];
        nck(i, v-1);
        save -= x[i];
    }
}


int main() {
    size_t i, j;
    int a;
    scanf("%u", &n);
    x = (int *)malloc(sizeof(int)*n);
    for(i=0;i<n;i++){x[i] = 0;}

    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d", &a);
            x[i] += a;
            x[j] += a;
        }
    }
    save = x[0];

    half = 0;
    for(i=0;i<n;i++){
        half += x[i];
    }half /= 2; // is even

    nck(0, n/2-1);
    printf("%d", ans);
    return 0;
}
