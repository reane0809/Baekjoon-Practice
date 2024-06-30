#include <stdio.h>

int main() {
	int N, result = 0;
	int dp[10][101] = { 0 };

	scanf("%d", &N);
	for (int i = 1; i <= 9; i++)
		dp[i][1] = 1;
	for (int i = 2; i <= N; i++) {
		for (int j = 1; j <= 8; j++)
			dp[j][i] = (dp[j + 1][i - 1] + dp[j - 1][i - 1]) % 1000000000;
		dp[0][i] = dp[1][i - 1];
		dp[9][i] = dp[8][i - 1];
	}
	for (int i = 0; i <= 9; i++)
		result = (result + dp[i][N]) % 1000000000;
	printf("%d", result);

	return 0;
}
