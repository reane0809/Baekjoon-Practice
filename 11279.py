import heapq
from sys import stdin

L = stdin.read().rstrip().split('\n')
heap = []
r = []
N = int(L[0])
for x in L[1:]:
	if x == '0':
		if len(heap) > 0:
			r.append(str(-heapq.heappop(heap)))
		else:
			r.append('0')
	else:
		heapq.heappush(heap, -int(x))
print('\n'.join(r))
