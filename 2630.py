from sys import stdin

input = stdin.readline


def making_colored_paper(n, cp, x, y):
    if n == 1:
        return cp[x][y]

    cp1 = making_colored_paper(n // 2, cp, x, y)
    cp2 = making_colored_paper(n // 2, cp, x, y + n // 2)
    cp3 = making_colored_paper(n // 2, cp, x + n // 2, y)
    cp4 = making_colored_paper(n // 2, cp, x + n // 2, y + n // 2)

    if cp1 == cp2 == cp3 == cp4 and len(cp1) == 1:
        return cp1

    return cp1+cp2+cp3+cp4


if __name__ == "__main__":
    N = int(input())
    paper = [input().split() for _ in range(N)]
    res = making_colored_paper(N, paper, 0, 0)
    print(res.count('0'), res.count('1'), sep='\n')
