#include<stdio.h>
char s[1001];
int main() {
	int t,len;
	scanf("%d", &t);
	while (t--) {
		scanf("%s", s);
		len = 0;
		while (s[len] != 0)len++;
		printf("%c%c\n", s[0], s[len - 1]);
	}
}
