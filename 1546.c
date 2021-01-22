#include<stdio.h>

int main() {

    int n, arr[1000], max;
    double add = 0;

    scanf("%d", &n);

    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    max = arr[0];
    for (int i = 0; i < n; i++)
        if (arr[i] > max)
            max = arr[i];
        for (int i = 0; i < n; i++)
            add += (double)arr[i] / max * 100;
    printf("%.2lf", (double)add / n);

}
