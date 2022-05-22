import sys
from collections import deque

input = sys.stdin.readline

# input

M, N = map(int, input().split())
table = [list(map(int, input().split())) for _ in range(N)]

# answer
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

queue = deque([])

for i in range(N):
    for j in range(M):
        if table[i][j] == 1:
            queue.append((i, j))

while queue:
    tmp = queue.popleft()
    for direction in range(4):
        nx = dx[direction] + tmp[0]
        ny = dy[direction] + tmp[1]
        if nx < 0 or ny < 0 or nx >= N or ny >= M:
            continue
        if table[nx][ny] != 0:
            continue
        table[nx][ny] = table[tmp[0]][tmp[1]] + 1
        queue.append((nx, ny))

def check_zero():
    max_value = 0
    for i in range(N):
        for j in range(M):
            if table[i][j] == 0:
                return -1
            else:
                max_value = max(max_value, table[i][j])
    return max_value - 1
print(check_zero())
