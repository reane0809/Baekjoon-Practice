#include <cstdio>
int a;
char t;
int main() {
	while (true) {
		scanf("%c", &t);
		if (t >= 'A' && t <= 'C')a += 3;
		else if (t >= 'D' && t <= 'F')a += 4;
		else if (t >= 'G' && t <= 'I')a += 5;
		else if (t >= 'J' && t <= 'L')a += 6;
		else if (t >= 'M' && t <= 'O')a += 7;
		else if (t >= 'P' && t <= 'S')a += 8;
		else if (t >= 'T' && t <= 'V')a += 9;
		else if (t >= 'W' && t <= 'Z')a += 10;
		else break;
	}
	printf("%d", a);
}
