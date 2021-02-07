#include<stdio.h>

int main() {
    int testcases;
    int n,k;
    int apt[17][17] = {0,0};

    for(n=1;n<16;n++) {
        apt[0][n]=n;
        apt[n][1]=1;
    }

    for(n=1;n<16;n++) {
        for(k=1;k<16;k++)
            apt[n][k]=apt[n-1][k]+apt[n][k-1];
    }
    
    scanf("%d",&testcases);
    
    while(testcases--) {
        scanf("%d %d",&n,&k);
        printf("%d\n",apt[n][k]);
    }

    return 0;
}
