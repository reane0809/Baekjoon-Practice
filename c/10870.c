#include <stdio.h>

int pac(int num) {

if (0 <= num&&num < 20) {

if (num == 0) return 0;

else if (num == 1)return 1;

else return pac(num - 1) + pac(num - 2);

}

}

int main() {

int n = 0;

scanf("%d", &n);

n=pac(n);

printf("%d", n);

return 0;

}
