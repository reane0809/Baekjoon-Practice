from collections import deque
def BFS():
    while q:
        ci, cj = q.popleft()
        for k in range(6):
            ni = ci + di[k]
            nj = cj + dj[k]
            if 0<=ni<N*H and 0<=nj<M and tmt[ci][cj] != -1 and tmt[ni][nj] == 0:
                if k < 4:
                    q.append((ni,nj))
                    tmt[ni][nj] = tmt[ci][cj] + 1
                elif k == 4:
                    if ni% N != N-1:
                        q.append((ni, nj))
                        tmt[ni][nj] = tmt[ci][cj] + 1
                elif k == 5:
                    if ni % N != 0:
                        q.append((ni, nj))
                        tmt[ni][nj] = tmt[ci][cj] + 1


M, N, H = map(int, input().split())
tmt = [list(map(int, input().split())) for _ in range(N*H)]
q = deque()
di = [0, 0, -N, N, -1, 1]
dj = [1, -1, 0, 0, 0, 0]
for i in range(N*H):
    for j in range(M):
        if tmt[i][j] == 1:
            q.append((i, j))
BFS()
sol = 0
x = 0
maxV = 0
for t in tmt:
    for a in t:
        if a == 0:
            print(-1)
            exit(0)
        else:
            if maxV <= a:
                maxV = a
                sol = maxV -1
print(sol)
