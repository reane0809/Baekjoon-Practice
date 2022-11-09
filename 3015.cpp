#include<cstdio>

int n,a[201],m;

int main() {
    scanf("%d", &n);

    for (int i = 0, x; i < n; i++) 
      scanf("%d", &x), a[x + 100]++;
    scanf("%d", &m);
    printf("%d", a[m + 100]);
    return 0;
}
