import sys

#sys.stdin = open('input.txt','r')


N,M = map(int,sys.stdin.readline().rstrip().split())

def dfs(List,index):
    if len(List) == M:
        for n,j in enumerate(List):
            if n < len(List) - 1:
                print(j,end=" ")
            else:
                print(j)

    for i in range(index,N+1):
        if i not in List:
            List.append(i)
            dfs(List,i+1)
            List.pop()

List = []
dfs(List, 1)

