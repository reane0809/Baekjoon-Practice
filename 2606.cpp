#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int ch[100];

int main() {
    int N, T, S = 0;
    int** arr;
    int queue[300], p1 = 0, p2 = 0;
    scanf("%d", &N);
    scanf("%d", &T);
    arr = (int**)malloc(sizeof(int*) * T);
    for (int i = 0; i < T; i++) arr[i] = (int*)malloc(sizeof(int) * 2);
    for (int i = 0; i < T; i++) scanf("%d %d", &arr[i][0], &arr[i][1]);
    queue[p2++] = 1;
    ch[0] = 1;
    while (p1 != p2) {
        for (int i = 0; i < T; i++)     {
            if (arr[i][0] == queue[p1] && ch[arr[i][1] - 1] == 0) {
                queue[p2++] = arr[i][1];
                ch[arr[i][1] - 1] = 1;
            }
            else if (arr[i][1] == queue[p1] && ch[arr[i][0] - 1] == 0) {
                queue[p2++] = arr[i][0];
                ch[arr[i][0] - 1] = 1;
            }
        }
        p1++;
    }
    for (int i = 0; i < N; i++) if (ch[i] == 1) S++;
    printf("%d", S - 1);
    return 0;
}
