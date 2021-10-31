import sys
read = sys.stdin.readline
n, m = map(int, read().split())
arr = [[*map(int, read().split())] for _ in range(n)]
def func(a, b):
    return [[sum(a[i][k] * b[k][j] for k in range(n)) % 1000
             for j in range(n)]
            for i in range(n)]
def dq(l, b):
    if b == 1:
        return [[l[i][j] % 1000 for j in range(n)] for i in range(n)]
    ll = dq(l, b // 2)
    tmp = func(ll, ll)
    if b % 2 == 0:
        return tmp
    return func(tmp, l)
for a in dq(arr, m):
    print(*a)
