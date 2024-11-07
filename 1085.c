#include<stdio.h>
int main() {
	int x, y, w,h;
	scanf("%d %d %d %d", &x, &y, &w, &h);
	if ((1 <= x <= w - 1) && (1 <= y <= h - 1)) {
		if ((x <= y) && (x <= w - x) && (x <= h - y)){
			printf("%d\n", x);
		}
		else if ((y <= x) && (y <= w - x) && (y <= h - y)){
			printf("%d\n", y);
		}
		else if ((w - x <= x) && (w - x <= y) && (w - x <= h - y)){
			printf("%d\n", w - x);
		}
		else if ((h - y <= x) && (h - y <= y) && (h - y <= w - x)){
			printf("%d\n", h - y);
		}
	}
	return 0;
}

