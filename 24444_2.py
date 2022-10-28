# BFS
from collections import deque
import sys
input = sys.stdin.readline
n, m, r = map(int, input().split())
graph = [[] for _ in range(n+1)]
for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)
for i in range(1, n+1):
    graph[i].sort()
visited = [0 for _ in range(n+1)]
visited[r] = 1
queue = deque([])
queue.append(r)
cnt = 1
while queue:
    now = queue.popleft()
    for next in graph[now]:
        if not visited[next]:
            queue.append(next)
            cnt += 1
            visited[next] = cnt
for i in visited[1:]:
    print(i)
