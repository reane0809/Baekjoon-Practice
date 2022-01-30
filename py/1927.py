import sys, heapq

input()

heap = []

for value in map(int, sys.stdin):
	if value: heapq.heappush(heap, value)
	else: print(heap and heapq.heappop(heap) or 0)
