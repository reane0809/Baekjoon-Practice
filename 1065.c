#include <stdio.h>

int main() {
	int n;
	int one = 0, ten = 0, hundred = 0;
	int result=0, cnt = 0;
	scanf("%d", &n);
	while (result < n) {
		one++;
		if (one == 10) {
			one = 0;
			ten++;
		}
		if (ten == 10) {
			ten = 0;
			hundred++;
		}
		result = one + ten * 10 + hundred * 100;

		if (result < 100)
			cnt++;
		else if (result < 1000) {
			if ((one + hundred) == 2 * ten)
				cnt++;
		}
	}
	printf("%d", cnt);
    return 0;
}
