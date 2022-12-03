#include <stdio.h>
#include <algorithm>

using namespace std;

int main(){
    int num[5],sum=0;

    for(int i=0;i<5;i++){
        scanf("%d",&num[i]);
        sum+=num[i];
    }

    for(int i=0;i<4;i++){
        for(int j=i+1;j<5;j++){
            if(num[i]>num[j]) swap(num[i],num[j]);
        }
    }

    printf("%d\n%d",sum/5,num[2]);

    return 0;
}
