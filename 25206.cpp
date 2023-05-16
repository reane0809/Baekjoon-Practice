#include <stdio.h>

double A, B;

double get_score(char a, char b) { return 4.0 - (a - 'A') + ((b == '+') ? 0.5 : 0.0); }

int main() {
	char in[100], gr[100];
	double t;

	while (true) {
		in[0] = 0;

		scanf("%s%lf%s", in, &t, gr);
		if (!in[0]) break;

		if (gr[0] == 'P') continue;

		B += t;
		if (gr[0] - 'F') A += t * get_score(gr[0], gr[1]);
	}

	printf("%.30lg", A / B);

	return 0;
}
