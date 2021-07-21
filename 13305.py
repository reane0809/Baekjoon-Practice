from sys import stdin

def solution():
    n = int(stdin.readline())
    dist = list(map(int, stdin.readline().split()))
    city = list(map(int, stdin.readline().split()))
    now = 0
    charge = 0    
    
    for i in range(n - 1):
        if city[now] <= city[i]:
            charge += city[now] * dist[i]
        else:
            now = i
            charge += city[now] * dist[i]

    print(charge)

    
solution()
