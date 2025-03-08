from sys import stdin
k, n = map(int, input().split())
l = [int(x) for x in stdin.read().splitlines()]
f = lambda x: sum([y//x for y in l])
bgn, end, mid = 1, max(l)+1, max(l)//2+1
while end>bgn+1:
    if f(mid)>=n:
        bgn, mid = mid, (mid+end)//2
    else:
        mid, end = (bgn+mid)//2, mid
print(bgn)

