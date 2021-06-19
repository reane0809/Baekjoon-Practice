from sys import stdin
read = stdin.readline

N = int(input())
matrix = []
dp = []

for i in range(1, N+1):
    matrix.append(list(map(int, read().split())))
    dp.append([0 for _ in range(i)])

dp[0] = matrix[0]
dp[1][0] = dp[0][0] + matrix[1][0]
dp[1][1] = dp[0][0] + matrix[1][1]

for i in range(2, N):
    dp[i][0] = matrix[i][0]+dp[i-1][0]
    dp[i][-1] = matrix[i][-1]+dp[i-1][-1]
    for j in range(1, i):
        dp[i][j] = matrix[i][j] + max(dp[i-1][j-1], dp[i-1][j])

print(max(dp[-1]))
