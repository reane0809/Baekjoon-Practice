import sys
from math import inf as INF
input = sys.stdin.readline


def main2(y, n):
    save = [[], [0]*n, [y[i+2] - y[i] for i in range(n-1)]] # save[a][b] means min_sum through x[b:a+b]
    knuth_old = [1]*(n-1)
    for k in range(3, n+1):
        a, knuth_new = [], []
        for i in range(n-k+1):
            temp, temp2 = INF, knuth_old[i]
            for m in range(knuth_old[i], knuth_old[i+1]+2):
                if temp >= (q := save[m][i] + save[k-m][m+i]):
                    temp, temp2 = q, m
            a.append(temp + y[k+i] - y[i]), knuth_new.append(temp2)
        save.append(a)
        knuth_old = knuth_new
    return save[-1][-1]


for _ in range(int(input())):
    n = int(input())
    x = list(map(int, input().split()))
    y = [0]
    for j in x:
        y.append(y[-1] + j)
    print(main2(y, n))
