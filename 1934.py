import sys
def gcd(a,b):
    if b==0:
        return a
    else:
        return gcd(b,a%b)

t = int(sys.stdin.readline())

for i in range(t):
    a, b = map(int, sys.stdin.readline().split())
    g = gcd(a,b)
    sys.stdout.write(str(a*b//g)+'\n')
