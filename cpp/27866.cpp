#include <stdio.h>
char s[1005];
int i;
int main() {
    scanf("%s",s);
    scanf("%d",&i);
    printf("%c",s[i-1]);
    return 0;
}
