import sys
import heapq

input = sys.stdin.readline

n = int(input())

plus = []
minus = []

for _ in range(n):
    x = int(input())
    if x > 0:
        heapq.heappush(plus, x)
    elif x < 0:
        heapq.heappush(minus, abs(x))
    else:
        if plus and minus:
            if plus[0] < minus[0]:
                print(heapq.heappop(plus))
            else:
                print(-heapq.heappop(minus))
        elif plus and not minus:
            print(heapq.heappop(plus))
        elif not plus and minus:
            print(-heapq.heappop(minus))
        else:
            print(0)

