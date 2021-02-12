#include <cstdio>

bool isPrime(int n){
    if(n==1) return false;
    for(int i=2; i*i <= n; i++){
        if(n%i == 0) return false; 
    }
    return true;
}
int main(){
    //freopen("input.txt", "r", stdin);
    int a, b;
    scanf("%d %d", &a, &b);
    int min=0, sum = 0;
    for(int i=a; i<=b; i++){
        if(isPrime(i)){
            if(!min) min = i;
            sum += i;
        }
    }
    if(!min) printf("-1\n");
    else printf("%d\n%d\n", sum, min);
    return 0;
}
