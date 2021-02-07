import sys
input = sys.stdin.readline

f = []
f0 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
f.append(f0)

for i in range(14):
    t = []
    for j in range(14):
        t.append(sum(f[i][:j+1]))
    f.append(t)

for i in range(int(input())):
    x = int(input())
    y = int(input())-1

    print(f[x][y])
