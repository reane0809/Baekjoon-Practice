import sys
input = sys.stdin.readline

def main():
  M, N = map(int, input().split())
  maze = []
  for _ in range(M):
    maze.append(list(map(int, list(input().rstrip()))))

  directions = (1, 0), (-1, 0), (0, 1), (0, -1)

  dist = [ [-1] * N for _ in range(M) ]
  dist[0][0] = 1
  def solveBFS(y, x):
    q = []
    q.append((y, x))
    while q:
      ny, nx = q.pop(0)
      if ny == M - 1 and x == N - 1: break
      for dy, dx in directions:
        wy = ny + dy
        wx = nx + dx
        if 0 <= wy < M and 0 <= wx < N:
          if maze[wy][wx] == 1 and dist[wy][wx] == -1:
            dist[wy][wx] = dist[ny][nx] + 1
            q.append((wy, wx))

    return dist[M - 1][N - 1]

  print(solveBFS(0, 0))

main()
