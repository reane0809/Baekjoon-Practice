import sys
input = sys.stdin.readline

N = int(input())
L = []
for i in range(N):
    r, c = map(int, input().split())
    if i == 0:
        L.append(r)
        L.append(c)
    else:
        L.append(c)
A = [[0] * (N + 1) for _ in range(N + 1)]
for i in range(1, N + 1):
    A[i][i] = 0
for l in range(2, N + 1):
    for i in range(1, N + 2 - l):
        j = i + l - 1
        m = 10 ** 100
        for k in range(i, j):
            cost = A[i][k] + A[k + 1][j] + L[i - 1] * L[k] *L[j]
            if cost < m:
                m = cost
        A[i][j] = m
print(A[1][N])
