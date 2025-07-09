#include <stdio.h>

int main(){
    int a,b,i;
    scanf("%d", &a);
    scanf("%d", &b);
    
    if(a>b)
        printf(">");
    else if(a<b)
        printf("<");
    else if(a==b)
        printf("==");
    
    return 0;
}

