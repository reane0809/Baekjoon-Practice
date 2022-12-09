#include <stdio.h>

int ans, val;
int row, col;

int main() {
	// freopen("input.txt", "r", stdin);
	row = col = 1;
	for (int x = 1; x <= 9; ++x) {
		for (int y = 1; y <= 9; ++y) {
			scanf("%d", &val);

			// 최대값이 갱신되는 경우
			if (ans < val) {
				ans = val;
				row = x;
				col = y;
			}
		}
	}

	printf("%d\n%d %d\n", ans, row, col);
}
