import sys
from collections import defaultdict

for _ in range(int(sys.stdin.readline())):
    v, e = map(int, sys.stdin.readline().split())
    graph = defaultdict(list)
    bipartite = [1] * v
    for __ in range(e):
        a, b = map(int, sys.stdin.readline().split())
        graph[a].append(b)
        graph[b].append(a)
        bipartite[a - 1] = 0
        bipartite[b - 1] = 0

    k = bipartite.index(0)
    queue = [k + 1]
    bipartite[k] = 1
    flag = True
    while True:
        if not queue:
            if 0 not in bipartite:
                break
            c = bipartite.index(0) + 1
            bipartite[c - 1] = 1
        else:
            c = queue.pop()

        for d in graph[c]:
            if bipartite[d - 1] == bipartite[c - 1]:
                flag = False
                break
            elif bipartite[d - 1] == 0:
                bipartite[d - 1] = 3 - bipartite[c - 1]
                queue.append(d)

        if not flag:
            print('NO')
            break

    if flag:
        print('YES')
