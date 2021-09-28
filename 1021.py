N, M = map(int, input().split())
Q = [i for i in range(1, N+1)]

ans = 0

for target in list(map(int, input().split())):
    p = Q.index(target)
    ans += min(p, len(Q) - p)
    Q = Q[(p+1):] + Q[:p]

print(ans)



