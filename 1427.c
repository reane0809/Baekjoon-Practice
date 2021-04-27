#include <cstdio>
int main() {
	char n[11] = {0,};
	int count[10] = {0,};

	scanf("%[0123456789]", n);

	for(int i = 0; n[i] != 0; i++)
		count[n[i] - '0'] += 1;

	for(int i = 9; i >= 0; i--)
		while(count[i]-- > 0)
			printf("%d", i);

	return 0;
}
