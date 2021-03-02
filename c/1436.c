#include <stdio.h>

int check(int k) {//666있으면 1 아니면 0
	int l = k, len = 1, cnt = 0;
	while (1) {
		l /= 10;
		if (l == 0)
			break;
		len++;
	}

	for (int i = 0; i < len; i++) {
		if (k % 10 == 6)
			cnt++;
		else
			cnt = 0;

		if (cnt == 3)
			break;
		k /= 10;
	}

	if (cnt == 3)
		return 1;
	else return 0;
}

int main() {
	int n, temp = 666, count = 0;

	scanf("%d", &n);

	while (1) {
		if (check(temp) == 1)
			count++;

		if (count == n)
			break;

		temp++;
	}

	printf("%d", temp);
}
