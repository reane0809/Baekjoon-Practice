from sys import stdin
from heapq import heappush, heappop

n = int(stdin.readline().rstrip())
l = []
r = []
res = []
mid = 0

for i in range(1, n+1):
    val = int(stdin.readline().rstrip())

    if i % 2:
        if l and val < (l[0] * (-1)):
            mid = heappop(l) * (-1)
            heappush(l, val * (-1))

        elif r and r[0] < val:
            mid = heappop(r)
            heappush(r, val)

        else:
            mid = val

        res.append(mid)

    else:
        if val < mid:
            heappush(r, mid)
            heappush(l, val*(-1))

        else:
            heappush(l, (-1) * mid)
            heappush(r, val)

        res.append(l[0] * (-1))

print('\n'.join(map(str, res)))
