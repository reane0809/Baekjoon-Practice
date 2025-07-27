import sys
input = sys.stdin.readline


def solve():
    N = int(input())
    dic = {}
    for _ in range(N):
        start, end = map(int, input().split())
        if dic.get(start):
            dic[start].append(end)  # min(dic.get(start, float('inf')), end)
        else:
            dic[start] = [end]
    
    for k in dic.keys():
        dic[k].sort()
        
    keys = sorted(dic.keys())
    end = 0
    count = 0
    for key in keys:
        for e in dic[key]:
            if e < end:
                end = e
            elif key >= end:
                count += 1
                end = e

    print(count)


solve()

