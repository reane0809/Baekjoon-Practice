#include <stdio.h>
int main(){

    int total = 0, num, a;
    scanf("%d", &num);
    for(a=1; a<=num; a++){
        total += a;
    }
    printf("%d", total);

    return 0;
}
