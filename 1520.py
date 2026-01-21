from sys import stdin, setrecursionlimit
setrecursionlimit(10000)

m, n = map(int, stdin.readline().split())
data = [list(map(int, stdin.readline().split())) for _ in range(m)]

# dxdy = (1, 0), (-1, 0), (0, 1), (0, -1)
dp = [[-1] * n for _ in range(m)]


def dfs(x, y):
    if x == m-1 and y == n-1:
        return 1
    if dp[x][y] == -1:
        dp[x][y] = 0
        if x - 1 >= 0 and data[x][y] > data[x - 1][y]:
            dp[x][y] = dp[x][y] + dfs(x - 1, y)
        if x + 1 < m and data[x][y] > data[x + 1][y]:
            dp[x][y] = dp[x][y] + dfs(x + 1, y)
        if y - 1 >= 0 and data[x][y] > data[x][y - 1]:
            dp[x][y] = dp[x][y] + dfs(x, y - 1)
        if y + 1 < n and data[x][y] > data[x][y + 1]:
            dp[x][y] = dp[x][y] + dfs(x, y + 1)
    return dp[x][y]


print(dfs(0, 0))

