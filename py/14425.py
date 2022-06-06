import sys

N, M = map(int, input().split())
a = sys.stdin.read().split()
s, q = set(a[:N]), a[N:]
print(sum(1 for x in q if x in s))
