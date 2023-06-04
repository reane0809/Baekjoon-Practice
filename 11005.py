import sys
n, m = map(int, sys.stdin.readline().split())
ans = []
while n>0:
    ans.append(n%m)
    n = n//m
ans.reverse()
for i in ans:
    if i>=10:
        print(chr(i+55),end='')
    else:
        print(i,end='')
