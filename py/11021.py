import sys

T= int(sys.stdin.readline())
for i in range(T):
     a, b = map(int, sys.stdin.readline().split())
     if a > 0 and b < 10:
         c = a + b
         k = i + 1
         print('Case #%d: %d' % (k, c))
