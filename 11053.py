import sys
read = sys.stdin.readline

n = int(read())
s = [*map(int, read().split())]

queue = []

def finder(m):
    for i in range(len(queue)):
        tmp = queue[i]
        if m <= tmp:
            return i
    return -1

for i in range(n):
    cream = s[i]
    tmp = finder(cream)
    if tmp == -1:
        queue.append(cream)
    else:
        queue[tmp] = cream

print(len(queue))
