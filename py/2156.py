import sys

n = int(sys.stdin.readline())


def gra(n):
    D = [0 for a in range(n + 1)]
    gla = [0]
    for i in range(n):
        gla.append(int(sys.stdin.readline()))

    D[1] = gla[1]
    if n > 1:
        D[2] = gla[1] + gla[2]

    for x in range(3, n + 1):
        D[x] = max(D[x - 1], max(D[x - 2] + gla[x], D[x - 3] + gla[x - 1] + gla[x]))

    print(D[n])


gra(n)
