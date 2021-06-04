import sys

p = [1, 1, 1, 2, 2]
for i in range(4, 101):
    p.append(p[i]+p[i-4])
for i in range(int(sys.stdin.readline())):
    print(p[int(sys.stdin.readline()) - 1])
