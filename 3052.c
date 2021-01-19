#include <stdio.h>

int main(void) {
    int arr[10] = {0,};
    int a=0;
    
    for (int i = 0; i < 10; i++) {
        scanf("%d", &arr[i]);
    }

    for (int q = 0; q < 10; q++) {
        arr[q] %= 42;
    }
    
    for (int c = 0; c < 42; c++) {
        for (int j = 0; j < 10; j++) {
            if (arr[j] == c) {
                a++;
                break;
            }
        }
    }

    printf("%d", a);
    return 0;
}
