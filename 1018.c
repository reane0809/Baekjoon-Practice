#include <cstdio>
#include <algorithm>
using namespace std;

int n, m;
char board[50][51];
const char* complete[8] =
{
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW"
};

int solve(int y, int x) {
    int res = 0;
    for (int i = 0; i < 8; ++i) {
        for (int j = 0; j < 8; ++j) {
            if (complete[i][j] != board[i + y][j + x]) {
                res += 1;
            }
        }
    }

    if (res > 64 - res) {
        res = 64 - res;
    }

    return res;
}

int main() {
    scanf("%d %d", &n, &m);

    for (int i = 0; i < n; ++i) {
        scanf("%s", board[i]);
    }

    int ret = 33;
    for (int x = 0; x <= m - 8; ++x) {
        for (int y = 0; y <= n - 8; ++y) {
            ret = min(ret, solve(y, x));
        }
    }

    printf("%d", ret);

    return 0;
}
