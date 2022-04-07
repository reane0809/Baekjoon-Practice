N, M = map(int, input().split())
data = list(map(int, input().split()))
C = list(map(int, input().split()))

dp = [-1] * 10001
dp[0] = 0
for i in range(N):
    el = data[i]
    c = C[i]
    for j in range(10000, -1, -1):
        if j >= c and dp[j-c] != -1:
            dp[j] = max(dp[j], dp[j-c]+el)
        
for i in range(10001):
    if dp[i] >= M:
        print(i)
        break
