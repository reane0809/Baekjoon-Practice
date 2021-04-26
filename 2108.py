import sys

num = int(sys.stdin.readline())
lis = []
line = [0] * 8001
cnt = 0

for i in range(num):
    n = int(sys.stdin.readline())
    lis += [n]
    line[n+4000] += 1

lis.sort()
print(round(sum(lis)/num))

sort_lis = sorted(set(lis))
print(lis[len(lis)//2])

most = max(line)
if line.count(most) == 1:
    print(line.index(most)-4000)
else:
    for i in line:
        if i == most:
            cnt += 1
            if cnt == 2:
                answer = line.index(i)-4000
                break
            elif cnt == 1:
                line[line.index(i)] = 0
    print(answer)

if num == 1:
    print(0)
else:
    print(max(lis)-min(lis))v
