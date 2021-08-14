import sys
read = sys.stdin.readline

for i in range(int(read())):
    n, m = map(int, read().split())
    ans = 1

    for j in range(1,1 + n):
        ans *= (m + 1 - j)/j

    print(round(ans))
