#include <cstdio>

using namespace std;

int main(){
    int n,m=0,k;
    int a[11];
    scanf("%d%d",&n,&k);
    for(int i=1;i<=n;i++) scanf("%d",&a[i]);
    for(int i=n;i>=0;i--){
        m+=k/a[i];
        k%=a[i];
    }
    printf("%d",m);
}
