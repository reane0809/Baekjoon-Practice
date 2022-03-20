n, k = map(int, input().split())

li = []
for _ in range(n):
    value = int(input())
    if value <= k:       
        li.append(value)
        
li.sort(reverse=True)

dp = [0] * (k + 1)
dp[0] = 1

for coin in li:
    for i in range(k):
        if i + coin > k:
            break
        dp[i + coin] += dp[i]
        
print(dp[k])
