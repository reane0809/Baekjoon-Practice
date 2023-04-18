#include <stdio.h>
#include <string.h>
int main() {
    char ahp[102];
    int size;
    scanf("%s", ahp);
    for (int a = 0; ; a++) {
        if (ahp[a] == '\0')
            break;
 
    }
  size = strlen(ahp); // 단어의 길이
 
    printf("%d\n", size);
}
