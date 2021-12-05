from sys import stdin
n, c = map(int, input().split())
x = [int(y) for y in stdin.read().splitlines()][:n]
x.sort()
def f(d):
    count, val = 1, x[0]+d
    for h in x:
        if h>=val:
            count, val = count+1, h+d
    return count
B, E = 1, (x[-1]-x[0])//(c-1)+1
while E>B+1:
    M = (B+E)//2
    B, E = (M, E) if f(M)>=c else (B, M)
print(B)
