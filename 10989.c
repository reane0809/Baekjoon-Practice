#include <stdio.h>
#include <stdlib.h>

int main() {
    int number[10000] = {0};
    int num, n, count = 0;
    scanf("%d", &num);
    for(int i = 0; i < num; i++) {
        scanf("%d", &n);
        number[n - 1]++;
    }
    for(int i = 0; i < 10000; i++) {
        for(int j = 0; j < number[i]; j++) {
            count++;
            printf("%d\n", i + 1);
            if(count == num)
                return 0;
        }
    }

    return 0;
}

